/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructer;
import java.util.Scanner;

/**
 *
 * @author S545394
 */
public class student
{
	public static void main(String[] args)
	{
		int x = 5;int y = 20; int z = 0; while(x < y) {x += 2;y -= 1;if(x + y > 27){z += 3;} else {z -= 2;}}System.out.println(x + " " + y + " " + z);
	}
}

