package com.java.science.utils;

/**
 * @Author: aiying014
 * Created by zcc on 16:17 2017/12/6.
 * @Description:
 */

	class Annoyance extends Exception {}
	class Sneeze extends Annoyance {}

	public class Human {

		public static void main(String[] args)
				throws Exception {
			try {
				try {
					throw new Sneeze();
				}
				catch ( Annoyance a ) {
					System.out.println("Caught Annoyance");
					throw a;
				}
			}
			catch ( Sneeze s ) {
				System.out.println("Caught Sneeze");
				return ;
			}
			finally {
				System.out.println("Hello World!");
			}
		}
	}

