package com.MathsX.yashsehgal;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import java.lang.Math;


@DesignerComponent(
        version = 1,
        description = "",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class MathsX extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public MathsX(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

@SimpleFunction(description = "used to find the highest value of x and y")
    public double Max(int x, int y){
        return Math.max(x,y);
    }

@SimpleFunction(description = "used to find the lowest value of x and y")
    public double Min(int x, int y){
        return Math.min(x,y);
    }
@SimpleFunction(description = "Returns the cube root of x")
    public double Cuberoot(int x){
        return Math.cbrt(x);
    }
@SimpleFunction(description = "Returns the square root of x")
    public double Squareroot(int x){
        return Math.sqrt(x);
    }
@SimpleFunction(description = "Returns the sine of x (x is in radians)")
    public double Sin(int x){
        return Math.sin(x);
    }
@SimpleFunction(description = "Returns the tangent of an angle")
    public double Tan(int x){
        return Math.tan(x);
    }
@SimpleFunction(description = "Returns the cosine of x (x is in radians)")
    public double Cos(int x){
        return Math.cos(x);
    }
@SimpleFunction(description = "Returns the value of x rounded to its nearest integer")
    public double Round(int x){
        return Math.round(x);
    }
@SimpleFunction(description = "Hypotenuse x,y - Returns sqrt(x2 +y2) without intermediate overflow or underflow")
    public double Hypotenuse(int x,int y){
        return Math.hypot(x,y);
    }
@SimpleFunction(description = "Returns the value of x to the power of y")
    public double Power(int x,int y){
        return Math.pow(x,y);
    }
}

