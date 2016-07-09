package di155_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import di154zhang.Generators;

public class BankTeller {
	public static void main(String []args)
	{
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c: line)
		{
			System.out.println(server(tellers.get(rand.nextInt(tellers.size())),c));
			
		}
	}

	private static String server(Teller teller, Customer c) {
		// TODO Auto-generated method stub
		return teller+"server"+c.toString();
	}
}
