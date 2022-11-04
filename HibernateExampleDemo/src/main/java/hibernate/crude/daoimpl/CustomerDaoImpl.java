package hibernate.crude.daoimpl;

import java.util.Scanner;
import hibernate.crude.entity.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.crude.config.HibernateUtil;
import hibernate.crude.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
	Scanner sc = new Scanner(System.in);

	public void getCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter Your Customer Id :");
			int id = sc.nextInt();
			sc.nextLine();
			Customer customer = session.get(Customer.class,id);
			System.out.println("--------------Customer Details-----------");
			System.out.println(customer.getId()+" "+customer.getName()+" "+customer.getAddress()+" "
					+customer.getEmail()+" "+customer.getPhone());
			
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

	public void addCustomer() {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transact = session.beginTransaction();
			
			System.out.println("Enter Customer Name:");
			String name = sc.nextLine();
			System.out.println("Enter Customer Address:");
			String address = sc.nextLine();
			System.out.println("Enter Customer Email:");
			String email = sc.nextLine();
			System.out.println("Enter Customer Contact number:");
			Long number = sc.nextLong();
			
			Customer cust = new Customer();
			cust.setName(name);
			cust.setAddress(address);
			cust.setEmail(email);
			cust.setPhone(number);
			
			session.save(cust);
			transact.commit();
			System.out.println("-------Data Inserted Successfully-------");
			
			
		}catch(HibernateException e){
			System.out.println(e);	
		}
		
		
	}

	public void updateCustomer() {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter Your Customer Id:");
		int id = sc.nextInt();
		sc.nextLine();
		Customer cd1 = session.get(Customer.class,id);
		System.out.println("Enter Update Phone Number:");
		Long number = sc.nextLong();
		cd1.setPhone(number);
		session.update(cd1);
		transaction.commit();
		System.out.println("---------"
				+ "Updated SuccessFully----------");
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
		
	}

	public void deleteCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			System.out.println("Enter Your Customer Id:");
			int id = sc.nextInt();
			sc.nextLine();
			Customer cd2 = session.get(Customer.class,id);
			session.delete(cd2);
			transaction.commit();
			System.out.println("---------------Deleted Successfully---------");
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}
	


}
