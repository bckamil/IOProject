package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.*;
import pl.put.poznan.transformer.logic.decorators.*;


import java.util.Arrays;

/**
 * Rest controller for text input and JSON
 * @author marek
 *
 */
@RestController
//@RequestMapping("/common/{text}")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    /**
     * GET
     * This function controls GET request with text input and JSON output
     *
     * @param text Text to transform
     * @param transforms List of transforms in form {text}?transforms={list_of_transforms}
     * @return  JSON
     */
    @RequestMapping(value="/common/{text}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="inverse") String[] transforms) {

        // log the parameters
        logger.info("Input");
        logger.debug(text);
        logger.info("Operation");
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        TextTransformer transformer = new TextTransformer(transforms, text);
        transformer.transform();
        DataTemplateJSON dataTemplateJSON = new DataTemplateJSON(transforms, transformer.getInputText());
        
        //log the output
        logger.info("Output");
        logger.debug(transformer.getInputText());

        return new ResponseEntity<DataTemplateJSON>(dataTemplateJSON, HttpStatus.OK);

        // return transformer.inverseTransform();
    }

    /**
     * POST
     *  This function controls POST request with JSON input and output
     *
     *
     * @param dataTemplateJSON Input in JSON format with text to transform and list of transforms
     * @return It returns JSON with processed text and list od transforms
     */
    @RequestMapping(value="/post", method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody DataTemplateJSON dataTemplateJSON) {


        //log the parameters
        logger.info("Input");
        logger.debug(dataTemplateJSON.getText());
        logger.info("Operation");
        logger.debug(Arrays.toString(dataTemplateJSON.getTransforms()));

        TextTransformer transformer = new TextTransformer(dataTemplateJSON.getTransforms(), dataTemplateJSON.getText());
        transformer.transform();
        dataTemplateJSON.setText(transformer.getInputText());
        
        //log the output
        logger.info("Output");
        logger.debug(transformer.getInputText());

        return new ResponseEntity<DataTemplateJSON>(dataTemplateJSON, HttpStatus.OK);
    }



}


