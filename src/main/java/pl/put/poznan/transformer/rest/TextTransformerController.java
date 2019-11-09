package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.*;
import pl.put.poznan.transformer.logic.decorators.*;


import java.util.Arrays;


@RestController
//@RequestMapping("/common/{text}")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(value="/common/{text}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        TextTransformer transformer = new TextTransformer(transforms, text);
        transformer.transform();
        DataTemplateJSON dataTemplateJSON = new DataTemplateJSON(transforms, transformer.getInputText());

        return new ResponseEntity<DataTemplateJSON>(dataTemplateJSON, HttpStatus.OK);

    }

    @RequestMapping(value="/post", method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody DataTemplateJSON dataTemplateJSON) {


        TextTransformer transformer = new TextTransformer(dataTemplateJSON.getTransforms(), dataTemplateJSON.getText());
        transformer.transform();
        dataTemplateJSON.setText(transformer.getInputText());
//        // log the parameters
//        logger.debug(text);
//        logger.debug(Arrays.toString(transforms));
//
        return new ResponseEntity<DataTemplateJSON>(dataTemplateJSON, HttpStatus.OK);
    }



}


