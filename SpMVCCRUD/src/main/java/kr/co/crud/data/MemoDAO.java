package kr.co.crud.data;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoDAO {
	public List<MemoDTO> selectAll();
	public void insertOk(@Param("name")String name, @Param("memo") String memo);
	public void deleteOk(@Param("id") int id);
	public MemoDTO selectOne();

	public void updateOk(int id, String name, String memo);
	public void updateOk2(MemoDTO memoDTO);
}
