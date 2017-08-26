package core.repository;


import common.model.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by ytx on 17/5/17.
 */
@Repository("apiOperationRepository")
public interface ApiOperationRepository extends JpaRepository<ApiOperation, Long>
        , JpaSpecificationExecutor<ApiOperation> {

}
