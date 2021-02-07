package br.com.tamawilson.mybatisquerybuilderexample.mapper;

import br.com.tamawilson.mybatisquerybuilderexample.model.Foo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FooMapper {

    List<Foo> findByCriteria(@Param("predicate") String predicate);

}
