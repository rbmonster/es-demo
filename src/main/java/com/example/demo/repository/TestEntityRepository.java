package com.example.demo.repository;

import com.example.demo.entity.TestEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestEntityRepository extends ElasticsearchRepository<TestEntity, String> {


    @Query("{\"match\": {\"status\": {\"query\": \"?0\"}}}")
    Page<TestEntity> findByName(String status, Pageable pageable);


    @Query("{\"match\": {\"version\": {\"query\": \"?0\"}}}")
    Page<TestEntity> findByVersion(Integer version, Pageable pageable);


    List<TestEntity> findByStatus(String status);


    public static void main(String[] args) {
        String currency = "KRW";
        int scale;
        switch (currency) {
            case "KRW":
                scale = 6;
                break;
            case "JPY":
                scale = 5;
                break;
            default:
                scale = 4;
        }
        System.out.println(scale);
    }

}
