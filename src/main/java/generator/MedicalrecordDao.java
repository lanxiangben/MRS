package generator;

import generator.Medicalrecord;
import generator.MedicalrecordExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface MedicalrecordDao {
    long countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(String medicalrecordid);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    List<Medicalrecord> selectByExample(MedicalrecordExample example);

    int updateByExampleSelective(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);
}