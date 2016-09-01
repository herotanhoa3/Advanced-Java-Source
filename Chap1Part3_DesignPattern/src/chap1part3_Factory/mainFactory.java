/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap1part3_Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class mainFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        BufferedReader  input = new BufferedReader(new InputStreamReader(System.in));
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Input type: ");
        String type = input.readLine();
        Shape shape = shapeFactory.getShape(type);
        shape.draw();
    }
    
}
