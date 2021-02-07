package br.com.tamawilson.mybatisquerybuilderexample.service;

import br.com.tamawilson.mybatisquerybuilder.MyBatisPredicateBuilder;
import br.com.tamawilson.mybatisquerybuilder.model.dto.SearchCriteriaWrapper;
import br.com.tamawilson.mybatisquerybuilderexample.mapper.FooMapper;
import br.com.tamawilson.mybatisquerybuilderexample.model.Foo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FooService {

    private FooMapper fooMapper;

    public FooService(FooMapper fooMapper) {
        this.fooMapper = fooMapper;
    }

    public List<Foo> findByCriteria(SearchCriteriaWrapper searchCriteriaWrapper){
        String predicate = new MyBatisPredicateBuilder(Foo.class).withCriteria(searchCriteriaWrapper).build();
        return fooMapper.findByCriteria(predicate);
    }
}
