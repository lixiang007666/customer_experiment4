package top.lixiang007.dao;
import top.lixiang007.po.Customer;
/**
 * Customer接口文件
 */
public interface CustomerDao {
	/**
	 * 根据id查询客户信息
	 */
	public Customer findCustomerById(Integer id);
}
