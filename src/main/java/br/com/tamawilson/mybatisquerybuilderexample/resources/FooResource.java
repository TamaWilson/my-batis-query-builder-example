package br.com.tamawilson.mybatisquerybuilderexample.resources;

import br.com.tamawilson.mybatisquerybuilder.model.dto.SearchCriteriaWrapper;
import br.com.tamawilson.mybatisquerybuilderexample.model.Foo;
import br.com.tamawilson.mybatisquerybuilderexample.service.FooService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class FooResource {

    private FooService fooService;

    public FooResource(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping
    public List<Foo> fooResource(@RequestParam(value = "search", required = false)
                                         SearchCriteriaWrapper searchCriteriaWrapper){
        return fooService.findByCriteria(searchCriteriaWrapper);
    }

}
