package group10.bookShop.DAO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

// import javax.persistence.Query; lặp jpaQuery



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import group10.bookShop.entities.Sach;
import group10.bookShop.entities.UserRole;

//@NoRepositoryBean
@Repository
public interface SachRepository extends CrudRepository<Sach, Integer>{
	
	// interger la kieu du lieu khoa chinh cua contact entity
		// lớp crud cung cấp các method như là thêm xóa sửa, không cần implementation mà nó tự tạo khi runtime 
		
	List<Sach> findByTensachContaining(String term);  // tìm kiếm theo line và theo đúng tên mà mình mong muốn
    List<Sach> findByOrderByMasachDesc();
    List<Sach> findByOrderByLuocxemDesc();
    List<Sach> findByOrderBySoluongdabanDesc();
    List<Sach> findSachByTheloai( String theloai);
    
    @Query("SELECT e FROM Sach e WHERE e.theloai = ?1")
    List<Sach> findByCategory(String category);

}
