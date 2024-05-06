/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author harisnaeem
 */
public class CircleGeometry extends Geometry{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
