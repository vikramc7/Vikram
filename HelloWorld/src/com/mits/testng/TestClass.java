package com.mits.testng;



	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


	public class TestClass {
	    static long solve(long a, long b, long c){
	        // Write your code here
	        long result = 0;

	        return result;    
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i = 0; t_i < T; t_i++)
	        {
	            String[] line = br.readLine().split(" ");
	            long a = Long.parseLong(line[0]);
	            long b = Long.parseLong(line[1]);
	            long c = Long.parseLong(line[2]);

	            long out_ = solve(a, b, c);
	            System.out.println("..."+out_);
	         }

	         wr.close();
	         br.close();
	    }
	}
	