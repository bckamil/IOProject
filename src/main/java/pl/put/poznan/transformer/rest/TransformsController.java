package pl.put.poznan.transformer.rest;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.*;
import pl.put.poznan.transformer.logic.decorators.*;

@RestController
public class TransformsController {

    //THere should be 1st endpoint
    @RequestMapping(value = "upper/{text}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String textUpper(@PathVariable String text){


//        AbstractInput test;
////        test = new TextInput();
//        test = new UpperDecorator(test);
//
//        return test.getText();

        return text;
    }
}
