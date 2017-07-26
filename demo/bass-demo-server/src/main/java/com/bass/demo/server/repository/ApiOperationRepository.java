package com.bass.demo.server.repository;


import com.bass.demo.common.model.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by ytx on 17/5/17.
 */
@Repository
public interface ApiOperationRepository extends JpaRepository<ApiOperation, String>
        , JpaSpecificationExecutor<ApiOperation> {

}
