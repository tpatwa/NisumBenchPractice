package com.SpringHibernate.App;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHibernate.stock.bo.StockBo;
import com.SpringHibernate.stock.model.Stock;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/BeanLocations.xml");

		PerformOperation(appContext);

	  System.out.println("Please type Yes to continue else press No");
		Scanner scanner = new Scanner(System.in);
		String yesOrNo = scanner.next();

		if (yesOrNo.equals("Yes")) {
			PerformOperation(appContext);
		} else {

			// Exit;

		}

	}

	private static void PerformOperation(ApplicationContext appContext) {

		StockBo stockBo = (StockBo)appContext.getBean("stockBo");
		System.out.println("Please select opertaion to perform:");
		System.out.println("a:Insert Stock");
		System.out.println("b:Update Stock Name");
		System.out.println("c:Find Stock By Stock Code");
		System.out.println("d:Delete stock\n");

		Scanner scanner = new Scanner(System.in);
		String i = scanner.next().toString();

		switch (i) {

		case "a":
			System.out.println("Insert Stock Code:");
			String code = scanner.next();
			System.out.println("Insert Stock Name:");
			String Name = scanner.next();
			Stock stockToInsert = new Stock();
			stockToInsert.setStockCode(code);
			stockToInsert.setStockName(Name);
			stockBo.save(stockToInsert);
			System.out.println("*************Saved*******************");
			break;
		// Update
		case "b":
			System.out.println("Enter Stock Code:");
			String stockCodeToUpdate = scanner.next();
			Stock stockToUpdate = stockBo.findByStockCode(stockCodeToUpdate);

			System.out.println(stockToUpdate.getStockId());
			System.out.println(stockToUpdate.getStockCode());
			System.out.println(stockToUpdate.getStockName());

			System.out.println("Enter Stock name you want to update:");
			String newStockName = scanner.next();

			stockToUpdate.setStockName(newStockName);
			stockBo.update(stockToUpdate);
			System.out.println("************Updated******************");
			break;
		// Show
		case "c":
			System.out.println("Enter Stock Code:");
			String stockCodeToFind = scanner.next();
			Stock stockToFind = stockBo.findByStockCode(stockCodeToFind);
			if (stockToFind != null) {

				System.out.println("Stock Id:" + "  " + stockToFind.getStockId() + "   " + "Stock Name:"
						+ stockToFind.getStockName());
				System.out.println("*************Record Found**************");
			}
			else 
			{
				System.out.println("Record Not Found");
			}

			break;

		// Delete
		case "d":
			System.out.println("Enter Stock Code you want to delete:");
			String stockCodeDelete =(scanner.next());
			 stockBo.deleteByCode(stockCodeDelete);
			 System.out.println("*************Record Deleted**************");
			break;

		default:
			throw new IllegalArgumentException("Invalid option selected");

		}
		System.out.println("Do you wish to continue? Yes/No");
		// Scanner scanner = new Scanner(System.in);
		String yesOrNo = scanner.next();

		if (yesOrNo.equalsIgnoreCase("Yes")) {
			PerformOperation(appContext);
		} 
		else
		{
			// Exit;
		}
	}

}
