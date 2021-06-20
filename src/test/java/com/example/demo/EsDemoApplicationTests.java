package com.example.demo;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestEntityRepository;
import com.example.demo.service.TestEntityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EsDemoApplicationTests {

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Test
    public void contextLoads() {
        Criteria criteria = new Criteria("status").is("Success");
//        Criteria criteria = new Criteria();
        CriteriaQuery criteriaQuery = new CriteriaQuery(criteria);
//        List<TestEntity> test = elasticsearchOperations.queryForList(criteriaQuery, TestEntity.class);
//        System.out.println(test);

    }



    @Test
    public void contextLoads1() {

        TestEntity person = elasticsearchOperations
                .queryForObject(GetQuery.getById("1"), TestEntity.class);
        System.out.println(person);
    }

    @Autowired
    private TestEntityService testEntityService;

    @Autowired
    private TestEntityRepository testEntityRepository;
    @Test
    public void testRepository() {
//        Page<TestEntity> success = testEntityService.findVersion(1);
//        Page<TestEntity> success = testEntityService.find("Success");
//        Page<TestEntity> success = testEntityService.find("Success");
        List<TestEntity> failed = testEntityRepository.findByStatus("Failed");
//        Optional<TestEntity> testEntityStream = failed.get().findAny();
        System.out.println(failed);
//        System.out.println(testEntityStream);
    }

}
