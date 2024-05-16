
package com.mycompany.jssu.estadisticamain1;

import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticaMain1 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double seleccion, seleccion2;
        Estadistica1 Datos= new Estadistica1();
        ArrayList<Double>EstaDatosVx = new ArrayList<>();
        ArrayList<Double>EstaDatosVoy = new ArrayList<>();
        ArrayList<Double>EstaDatosVy = new ArrayList<>();
        ArrayList<Double>EstaDatosVM = new ArrayList<>();
        ArrayList<Double>EstaDatosXx = new ArrayList<>();
        ArrayList<Double>EstaDatosXy = new ArrayList<>();
        ArrayList<Double>EstaDatosYmax = new ArrayList<>();
        ArrayList<Double>EstaDatosXmax = new ArrayList<>();
        ArrayList<Double>EstaDatosTv = new ArrayList<>();
        ArrayList<Double>EstaDatosTmax = new ArrayList<>();
        ArrayList<Double>EstaDatosDV = new ArrayList<>();
        
        
        ArrayList<Double>EstaDatosVxH = new ArrayList<>();
        ArrayList<Double>EstaDatosVyH = new ArrayList<>();
        ArrayList<Double>EstaDatosVMH = new ArrayList<>();
        ArrayList<Double>EstaDatosXxH = new ArrayList<>();
        ArrayList<Double>EstaDatosXyH = new ArrayList<>();
        ArrayList<Double>EstaDatosXmaxH = new ArrayList<>();
        ArrayList<Double>EstaDatosTvH = new ArrayList<>();
        ArrayList<Double>EstaDatosDDH = new ArrayList<>();
        ArrayList<Double>EstaDatosYPH = new ArrayList<>();
        ArrayList<Double>EstaDatosDTH = new ArrayList<>();
        ArrayList<Double>EstaDatosDVH = new ArrayList<>();
        
        ArrayList<Double>EstaDatosMedia = new ArrayList<>();
        ArrayList<Double>EstaDatosMediana = new ArrayList<>();
        ArrayList<Double>EstaDatosModa = new ArrayList<>();
        ArrayList<Double>EstaDatosXB = new ArrayList<>();
        ArrayList<Double>EstaDatosYB = new ArrayList<>();
         
        System.out.println("Bienvenido.");
        do{
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Seleccione la opcion que desee: ");
            System.out.println("1. Fisica.");
            System.out.println("2. Estadistica.");
            System.out.println("3. Salir.");
            System.out.print("Opcion: ");
            seleccion2=input.nextDouble();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" ");
            switch((int)seleccion2){
                case 1:
                    do{
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Seleccione la accion a realizar: ");
                        System.out.println("1. Calcular un Lanzamiento Inclinado.");
                        System.out.println("2. Calcular un Lanzamiento Horizontal.");
                        System.out.println("3. Salir.");
                        System.out.print("Opcion: ");
                        seleccion=input.nextDouble();
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println(" ");
                        switch((int) seleccion){
                            case 1:
                                do{
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Seleccione la accion a realizar: ");
                                    System.out.println("1. Calcular las componentes Horizontales.");
                                    System.out.println("2. Calcular las componentes Verticales.");
                                    System.out.println("3. Calcular el tiempo.");
                                    System.out.println("4. Calcular la magnitud de la Velocidad.");
                                    System.out.println("5. Calcular la direccion de la velocidad.");
                                    System.out.println("6. Salir.");
                                    System.out.print("Opcion: ");
                                    seleccion= input.nextDouble();
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println(" ");
                                    switch((int)seleccion){
                                        case 1:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar. ");
                                            System.out.println("1. Calcular la velocidad en X.");
                                            System.out.println("2. Calcular el desplazamiento en X en cualquier punto.");
                                            System.out.println("3. Calcular el desplazamiento maximo en X.");
                                            System.out.println("4. Salir.");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial: ");
                                                    Datos.setVo(input.nextDouble());
                                                    System.out.print("Ingrese el angulo: ");
                                                    Datos.setAng(input.nextDouble());
                                                    Datos.componenteHorizontal(EstaDatosVx);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad en X: ");
                                                    Datos.setVox(input.nextDouble());
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.DesplazamientoHorizontal(EstaDatosXx);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad en X: ");
                                                    Datos.setVox(input.nextDouble());
                                                    System.out.print("Ingrese el tiempo de vuelo: ");
                                                    Datos.setTv(input.nextDouble());
                                                    Datos.DesplazamientoHorizontalMaximo(EstaDatosXmax);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 4:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted eligio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese una opcion valida.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                        }while(seleccion!=4| seleccion-Math.round(seleccion)!=0);
                                            break;
                                    case 2:
                                        do{
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar. ");
                                            System.out.println("1. Calcular la velocidad inical en Y.");
                                            System.out.println("2. Calcular la velocidad en cualquier punto de Y.");
                                            System.out.println("3. Calcular el desplazamiento en Y en cualquier punto.");
                                            System.out.println("4. Calcular el desplazamiento maximo en Y.");
                                            System.out.println("5. Salir.");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial: ");
                                                    Datos.setVo(input.nextDouble());
                                                    System.out.print("Ingrese el angulo: ");
                                                    Datos.setAng(input.nextDouble());
                                                    Datos.componenteVertical(EstaDatosVoy);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial en Y: ");
                                                    Datos.setVoy(input.nextDouble());
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.componenteVerticalPuntos(EstaDatosVy);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial en Y: ");
                                                    Datos.setVoy(input.nextDouble());
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.DesplazamientoVertical(EstaDatosXy);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 4:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial en Y: ");
                                                    Datos.setVoy(input.nextDouble());
                                                    Datos.DesplazamientoVerticalMaximo(EstaDatosYmax);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 5:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted eligio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese una opcion valida.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                        }while(seleccion!=5 | seleccion-Math.round(seleccion)!=0);
                                        break;
                                    case 3:
                                        do{
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar. ");
                                            System.out.println("1. Calcular el tiempo necesario para llegar a la altura maxima.");
                                            System.out.println("2. Calcular el tiempo de vuelo del lanzamiento.");
                                            System.out.println("3. Salir.");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la velocidad inicial en Y: ");
                                                    Datos.setVoy(input.nextDouble());
                                                    Datos.TiempoMaximo(EstaDatosTmax);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese el tiempo en llegar a la altura maxima: ");
                                                    Datos.setTmax(input.nextDouble());
                                                    Datos.TiempoVuelo(EstaDatosTv);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                     System.out.println("Usted eligio salir.");
                                                     System.out.println("---------------------------------------------------------------------------");
                                                     System.out.println("");
                                                     break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese una opcion valida.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                        }while(seleccion!=3 | seleccion-Math.round(seleccion)!=0);
                                        break;
                                    case 4:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese la velocidad inicial en X: ");
                                        Datos.setVox(input.nextDouble());
                                        System.out.print("Ingrese la velocidad en Y que desee: ");
                                        Datos.setVy(input.nextDouble());
                                        Datos.MagnitudVelocidad(EstaDatosVM);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 5:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese la velocidad en Y que desee: ");
                                        Datos.setVy(input.nextDouble());
                                        System.out.print("Ingrese la velocidad en X: ");
                                        Datos.setVox(input.nextDouble());
                                        Datos.DireccionVelocidad(EstaDatosDV);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 6:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Usted eligio salir. ");
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    default:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Ingrese una opcion valida.");
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                    }
                                }while(seleccion!=6 | seleccion-Math.round(seleccion)!=0);   
                                break;
                            case 2:
                                do{
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Seleccione la accion a realizar: ");
                                    System.out.println("1. Calcular las componentes Horizontales.");
                                    System.out.println("2. Calcular las componentes Verticales.");
                                    System.out.println("3. Calcular el tiempo.");
                                    System.out.println("4. Calcular el desplazamiento total.");
                                    System.out.println("5. Calcular la magnitud de la Velocidad.");
                                    System.out.println("6. Calcular la direccion de la velocidad.");
                                    System.out.println("7. Calcular la direccion del desplazamiento.");
                                    System.out.println("8. Salir.");
                                    System.out.print("Opcion: ");
                                    seleccion= input.nextDouble();
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println(" ");
                                    switch((int)seleccion){
                                        case 1:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la accion a realizar. ");
                                                System.out.println("1. Calcular la velocidad en X.");
                                                System.out.println("2. Calcular el desplazamiento en X en cualquier punto.");
                                                System.out.println("3. Calcular el desplazamiento maximo en X.");
                                                System.out.println("4. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion=input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.print("Ingrese la velocidad inicial: ");
                                                        Datos.setVo(input.nextDouble());
                                                        Datos.componenteHorizontalH(EstaDatosVxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.print("Ingrese la velocidad en X: ");
                                                        Datos.setVox(input.nextDouble());
                                                        System.out.print("Ingrese el tiempo: ");
                                                        Datos.setT(input.nextDouble());
                                                        Datos.DesplazamientoHorizontalH(EstaDatosXxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 3:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.print("Ingrese la velocidad en X: ");
                                                        Datos.setVox(input.nextDouble());
                                                        System.out.print("Ingrese el tiempo de vuelo: ");
                                                        Datos.setTv(input.nextDouble());
                                                        Datos.DesplazamientoHorizontalMaximoH(EstaDatosXmaxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 4:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted eligio salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese una opcion valida.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                }
                                            }while(seleccion!=4| seleccion-Math.round(seleccion)!=0);
                                                break;
                                    case 2:
                                        do{
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar. ");
                                            System.out.println("1. Calcular la velocidad en cualquier punto de Y.");
                                            System.out.println("2. Calcular el desplazamiento en Y en cualquier punto.");
                                            System.out.println("3. Calcular la posicion en Y.");
                                            System.out.println("4. Salir.");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.componenteVerticalH(EstaDatosVyH);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.DesplazamientoVerticalH(EstaDatosXyH);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la posicion inicial en Y: ");
                                                    Datos.setYmax(input.nextDouble());
                                                    System.out.print("Ingrese el tiempo: ");
                                                    Datos.setT(input.nextDouble());
                                                    Datos.AlturaEnFuncionDelTiempo(EstaDatosYPH);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 4:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted eligio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese una opcion valida.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                        }while(seleccion!=4 | seleccion-Math.round(seleccion)!=0);
                                        break;
                                    case 3:
                                        do{
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar. ");
                                            System.out.println("1. Calccular el tiempo de vuelo del lanzamiento.");
                                            System.out.println("2. Salir.");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.print("Ingrese la altura maxima: ");
                                                    Datos.setYmax(input.nextDouble());
                                                    Datos.TiempoVueloH(EstaDatosTvH);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                     System.out.println("Usted eligio salir.");
                                                     System.out.println("---------------------------------------------------------------------------");
                                                     System.out.println(" ");
                                                     break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese una opcion valida.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                        }while(seleccion!=2 | seleccion-Math.round(seleccion)!=0);
                                        break;
                                    case 4:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese el desplazamiento en X: ");
                                        Datos.setXx(input.nextDouble());
                                        System.out.print("Ingrese el desplazamiento en Y: ");
                                        Datos.setXy(input.nextDouble());
                                        Datos.DesplazamientoTotalH(EstaDatosDTH);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 5:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese la velocidad inicial en X: ");
                                        Datos.setVox(input.nextDouble());
                                        System.out.print("Ingrese la velocidad en Y que desee: ");
                                        Datos.setVy(input.nextDouble());
                                        Datos.MagnitudVelocidadH(EstaDatosVMH);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 6:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese la velocidad en Y que desee: ");
                                        Datos.setVy(input.nextDouble());
                                        System.out.print("Ingrese la velocidad en X que desee: ");
                                        Datos.setVox(input.nextDouble());
                                        Datos.DireccionVelocidad(EstaDatosDVH);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 7:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.print("Ingrese la posicion en Y que desee: ");
                                        Datos.setXy(input.nextDouble());
                                        System.out.print("Ingrese la posicion en X que desee: ");
                                        Datos.setXx(input.nextDouble());
                                        Datos.DireccionDesplazamiento(EstaDatosDDH);
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    case 8:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Usted eligio salir. ");
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        break;
                                    default:
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Ingrese una opcion valida.");
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                    }
                                }while(seleccion!=8 | seleccion-Math.round(seleccion)!=0);   
                                break;
                            case 3: 
                                System.out.println("---------------------------------------------------------------------------");
                                System.out.println("Usted eligio salir.");
                                System.out.println("---------------------------------------------------------------------------");
                                System.out.println(" ");
                                break;
                            default:
                                System.out.println("---------------------------------------------------------------------------");
                                System.out.println("Ingrese un numero valido.");
                                System.out.println("---------------------------------------------------------------------------");
                                System.out.println(" ");
                            }
                        }while(seleccion!=3 | seleccion-Math.round(seleccion)!=0);
                        break;
                    case 2:
                        do{
                            System.out.println("---------------------------------------------------------------------------");
                            System.out.println("Seleccione la accion a realizar: ");
                            System.out.println("1. Calcular media.");
                            System.out.println("2. Calcular mediana.");
                            System.out.println("3. Calcular moda.");
                            System.out.println("4. Probabilidad matematica.");
                            System.out.println("5. Probabilidad frecuencial.");
                            System.out.println("6. Regresion lineal simple.");
                            System.out.println("7. Pruebas de hipotesis.");
                            System.out.println("8. Salir.");
                            System.out.println("Opcion: ");
                            seleccion = input.nextDouble();
                            System.out.println("---------------------------------------------------------------------------");
                            System.out.println(" ");
                            switch ((int)seleccion){
                                case 1: 
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Seleccione la accion a realizar: ");
                                    System.out.println("1. Ingresar datos y calcular la media.");
                                    System.out.println("2. Usar datos obtenidos del lanzamiento inclinado.");
                                    System.out.println("3. Usar datos obtenidos del lanzamiento horizontal.");
                                    System.out.println("4. Salir.");
                                    System.out.print("Opcion: ");
                                    seleccion = input.nextDouble();
                                    System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                    switch ((int)seleccion){
                                        case 1: 
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar: ");
                                            System.out.println("1. Ingresar Datos.");
                                            System.out.println("2. Calcular la media.");
                                            System.out.println("3. Salir ");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese los datos: ");
                                                    Datos.setProm(input.nextDouble());
                                                    EstaDatosMedia.add(Datos.getProm());
                                                    System.out.println("Sus datos ingresados son: ");
                                                    for (Double DatosArray: EstaDatosMedia ){
                                                        System.out.println(DatosArray+ " ");
                                                    }
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("La media de los datos ingresados son: ");
                                                    Datos.Media(EstaDatosMedia);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3: 
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted decidio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese un numero valido.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                            }while(seleccion!=3  | seleccion-Math.round(seleccion)!=0);
                                            break;
                                        case 2:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la media de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la media de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la media de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la media de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la media de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la media de los datos obtenidos del tiempo en alcanzar la altura maxima.");
                                                System.out.println("7. Calcular la media de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("8. Calcular la media de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVx){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosVx);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la media de los datos obtenidos de la velocidad incial en Y");
                                                            System.out.println("2. Calcular la media de los datos obtenidos de la velocidad posicional en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad inicial en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVoy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosVoy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosVy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la media de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la media de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXx){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXx);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la media de los datos obtenidos de las distancias maximas en Y");
                                                            System.out.println("2. Calcular la media de los datos obtenidos de las distancias puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia maxima en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosYmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTv){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosTv);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de alcace de la altura maxima obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTmax){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosTmax);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVM){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosVM);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDV){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosDV);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=9 | seleccion - Math.round(seleccion)!=0);
                                            break;
                                        case 3:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la media de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la media de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la media de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la media de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la media de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la media de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("7. Calcular la media de los datso obtenidos de el desplazamiento total.");
                                                System.out.println("8. Calcular la media de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Calcular la media de los datos obtenidos de la direccion del desplazamiento.");
                                                System.out.println("10. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVxH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosVxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVyH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosVyH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;       
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la media de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la media de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmaxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXmaxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la media de los datos obtenidos de las distancias en Y");
                                                            System.out.println("2. Calcular la media de los datos obtenidos de las posiciones puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXyH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosXyH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las posiciones puntuales en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYPH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.MediaX(EstaDatosYPH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTvH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosTvH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVMH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosVMH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del desplazamiento total obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDTH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosDTH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDVH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosDVH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion del desplazamiento obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDDH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.MediaX(EstaDatosDDH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 10:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=10 | seleccion -Math.round(seleccion)!=0);
                                            break;
                                        case 4:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Usted selecciono salir.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                        default:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Ingrese datos validos.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                    }
                                    }while(seleccion!=4 | seleccion - Math.round(seleccion)!=0);
                                    break;
                                    
                                case 2: 
                                    
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Seleccione la accion a realizar: ");
                                    System.out.println("1. Ingresar datos y calcular la mediana.");
                                    System.out.println("2. Usar datos obtenidos del lanzamiento inclinado.");
                                    System.out.println("3. Usar datos obtenidos del lanzamiento horizontal.");
                                    System.out.println("4. Salir.");
                                    System.out.print("Opcion: ");
                                    seleccion = input.nextDouble();
                                    System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                    switch ((int)seleccion){
                                        case 1: 
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar: ");
                                            System.out.println("1. Ingresar Datos.");
                                            System.out.println("2. Calcular la mediana.");
                                            System.out.println("3. Salir ");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese los datos: ");
                                                    Datos.setMediana1(input.nextDouble());
                                                    EstaDatosMediana.add(Datos.getMediana1());
                                                    System.out.println("Sus datos ingresados son: ");
                                                    for (Double DatosArray: EstaDatosMediana){
                                                        System.out.println(DatosArray+ " ");
                                                    }
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("La mediana de los datos ingresados son: ");
                                                    Datos.Mediana(EstaDatosMediana);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3: 
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted decidio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese un numero valido.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                            }while(seleccion!=3  | seleccion-Math.round(seleccion)!=0);
                                            break;
                                        case 2:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la mediana de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la mediana de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la mediana de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la mediana de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la mediana de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la mediana de los datos obtenidos del tiempo en alcanzar la altura maxima.");
                                                System.out.println("7. Calcular la mediana de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("8. Calcular la mediana de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVx){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosVx);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la mediana de los datos obtenidos de la velocidad incial en Y");
                                                            System.out.println("2. Calcular la mediana de los datos obtenidos de la velocidad posicional en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad inicial en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVoy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosVoy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosVy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la mediana de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la mediana de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXx){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXx);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la mediana de los datos obtenidos de las distancias maximas en Y");
                                                            System.out.println("2. Calcular la mediana de los datos obtenidos de las distancias puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia maxima en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosYmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTv){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosTv);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de alcace de la altura maxima obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTmax){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosTmax);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVM){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosVM);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDV){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosDV);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=9 | seleccion - Math.round(seleccion)!=0);
                                            break;
                                        case 3:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la mediana de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la mediana de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la mediana de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la mediana de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la mediana de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la mediana de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("7. Calcular la mediana de los datso obtenidos de el desplazamiento total.");
                                                System.out.println("8. Calcular la mediana de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Calcular la mediana de los datos obtenidos de la direccion del desplazamiento.");
                                                System.out.println("10. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVxH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosVxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVyH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosVyH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;       
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la mediana de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la mediana de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmaxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXmaxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la mediana de los datos obtenidos de las distancias en Y");
                                                            System.out.println("2. Calcular la mediana de los datos obtenidos de las posiciones puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXyH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosXyH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las posiciones puntuales en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYPH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Mediana(EstaDatosYPH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTvH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosTvH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVMH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosVMH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del desplazamiento total obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDTH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosDTH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDVH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosDVH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion del desplazamiento obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDDH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Mediana(EstaDatosDDH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 10:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=10 | seleccion -Math.round(seleccion)!=0);
                                            break;
                                        case 4:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Usted selecciono salir.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                        default:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Ingrese datos validos.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                    }
                                    }while(seleccion!=4 | seleccion - Math.round(seleccion)!=0);
                                    break;
                                    
                                case 3: 
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Seleccione la accion a realizar: ");
                                    System.out.println("1. Ingresar datos y calcular la moda.");
                                    System.out.println("2. Usar datos obtenidos del lanzamiento inclinado.");
                                    System.out.println("3. Usar datos obtenidos del lanzamiento horizontal.");
                                    System.out.println("4. Salir.");
                                    System.out.print("Opcion: ");
                                    seleccion = input.nextDouble();
                                    System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                    switch ((int)seleccion){
                                        case 1: 
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Seleccione la accion a realizar: ");
                                            System.out.println("1. Ingresar Datos.");
                                            System.out.println("2. Calcular la moda.");
                                            System.out.println("3. Salir ");
                                            System.out.print("Opcion: ");
                                            seleccion=input.nextDouble();
                                            System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                            switch((int)seleccion){
                                                case 1:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese los datos: ");
                                                    Datos.setModa1(input.nextDouble());
                                                    EstaDatosModa.add(Datos.getModa1());
                                                    System.out.println("Sus datos ingresados son: ");
                                                    for (Double DatosArray: EstaDatosModa){
                                                        System.out.println(DatosArray+ " ");
                                                    }
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 2:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("La moda de los datos ingresados son: ");
                                                    Datos.Moda(EstaDatosModa);
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                case 3: 
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Usted decidio salir.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                                default:
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println("Ingrese un numero valido.");
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    break;
                                            }
                                            }while(seleccion!=3  | seleccion-Math.round(seleccion)!=0);
                                            break;
                                        case 2:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la moda de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la moda de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la moda de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la moda de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la moda de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la moda de los datos obtenidos del tiempo en alcanzar la altura maxima.");
                                                System.out.println("7. Calcular la moda de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("8. Calcular la moda de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVx){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosVx);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la moda de los datos obtenidos de la velocidad incial en Y");
                                                            System.out.println("2. Calcular la moda de los datos obtenidos de la velocidad posicional en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad inicial en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVoy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosVoy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosVy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosVy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la moda de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la moda de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXx){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXx);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la moda de los datos obtenidos de las distancias maximas en Y");
                                                            System.out.println("2. Calcular la moda de los datos obtenidos de las distancias puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia maxima en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYmax){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosYmax);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancia en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXy){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXy);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTv){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosTv);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de alcace de la altura maxima obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTmax){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosTmax);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVM){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosVM);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDV){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosDV);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=9 | seleccion - Math.round(seleccion)!=0);
                                            break;
                                        case 3:
                                            do{
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Seleccione la opcion a realizar: ");
                                                System.out.println("1. Calcular la moda de los datos obtenidos de la velocidad en X.");
                                                System.out.println("2. Calcular la moda de los datos obtenidos de la velocidad en Y");
                                                System.out.println("3. Calcular la moda de los datos obtenidos de la distancia en X");
                                                System.out.println("4. Calcular la moda de los datos obtenidos de la distancia en Y");
                                                System.out.println("5. Calcular la moda de los datos obtenidos del tiempo de vuelo.");
                                                System.out.println("6. Calcular la moda de los datos obtenidos de la magnitud de la velocidad.");
                                                System.out.println("7. Calcular la moda de los datos obtenidos de el desplazamiento total.");
                                                System.out.println("8. Calcular la moda de los datos obtenidos de la direccion de la velocidad.");
                                                System.out.println("9. Calcular la moda de los datos obtenidos de la direccion del desplazamiento.");
                                                System.out.println("10. Salir.");
                                                System.out.print("Opcion: ");
                                                seleccion= input.nextDouble();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                switch((int)seleccion){
                                                    case 1:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en X obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVxH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosVxH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 2:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la velocidad en Y obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVyH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosVyH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;       
                                                    case 3:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la moda de los datos obtenidos de las distancias maximas en X");
                                                            System.out.println("2. Calcular la moda de los datos obtenidos de las distancias puntuales en X");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las distancias maximas en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXmaxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXmaxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en X obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXxH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXxH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 4:
                                                        do{
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Seleccione la accion a realizar: ");
                                                            System.out.println("1. Calcular la moda de los datos obtenidos de las distancias en Y");
                                                            System.out.println("2. Calcular la moda de los datos obtenidos de las posiciones puntuales en Y");
                                                            System.out.println("3. Salir.");
                                                            System.out.print("Opcion: ");
                                                            seleccion=input.nextDouble();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            switch((int)seleccion){
                                                                case 1:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de la distancias en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosXyH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosXyH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 2:
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println("Los datos de las posiciones puntuales en Y obtenidos son: ");
                                                                    for(Double DatosArray: EstaDatosYPH){
                                                                        System.out.println(DatosArray+" ");
                                                                    }
                                                                    Datos.Moda(EstaDatosYPH);
                                                                    System.out.println("---------------------------------------------------------------------------");
                                                                    System.out.println(" ");
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Usted selecciono salir.");
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un numero valido");
                                                                    break;
                                                            }
                                                        }while(seleccion!=3 | seleccion- Math.round(seleccion)!=0);
                                                        break;
                                                    case 5:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del Tiempo de vuelo obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosTvH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosTvH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 6:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la magnitud de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosVMH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosVMH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 7:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos del desplazamiento total obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDTH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosDTH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 8:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion de la velocidad obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDVH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosDVH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 9:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Los datos de la direccion del desplazamiento obtenidos son: ");
                                                        for(Double DatosArray: EstaDatosDDH){
                                                            System.out.println(DatosArray+" ");
                                                        }
                                                        Datos.Moda(EstaDatosDDH);
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    case 10:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Usted seleccino salir.");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        break;
                                                    default:
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println("Ingrese un numero valido");
                                                        System.out.println("---------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                }
                                            }while(seleccion!=10 | seleccion -Math.round(seleccion)!=0);
                                            break;
                                        case 4:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Usted selecciono salir.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                        default:
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println("Ingrese datos validos.");
                                            System.out.println("---------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            break;
                                    }
                                    }while(seleccion!=4 | seleccion - Math.round(seleccion)!=0);
                                    break;
                                case 4:
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Ingrese la cantidad de casos favorables: ");
                                    Datos.setCF(input.nextDouble());
                                    System.out.println("Ingrese la cantidad de casos posibles: ");
                                    Datos.setCP(input.nextDouble());
                                    Datos.probabilidadMatematica();
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println(" ");
                                    break;
                                case 5:
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Seleccione la accion a realizar.");
                                        System.out.println("1. Ley del Complemento.");
                                        System.out.println("2. Usar la ley de la suma.");
                                        System.out.println("3. Regla de la multiplicacion.");
                                        System.out.println("4. Salir.");
                                        System.out.print("Opcion: ");
                                        seleccion=input.nextDouble();
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        switch((int)seleccion){
                                            case 1:
                                                System.out.println("---------------------------------------------------------------------------");
                                                Datos.Complemento();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 2:
                                                System.out.println("---------------------------------------------------------------------------");
                                                Datos.LeySuma();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 3:
                                                do{
                                                    System.out.println("Seleccione que desea hacer: ");
                                                    System.out.println("1. Regla de la multiplicacion con reemplazo.");
                                                    System.out.println("2. Regla de la multiplicacion sin reemplazo.");
                                                    System.out.println("3. Salir.");
                                                    System.out.print("Opcion:");
                                                    seleccion=input.nextDouble();
                                                    System.out.println("---------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    switch((int)seleccion){
                                                        case 1:
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            Datos.LeyMultiplicacionR();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            break;
                                                        case 2:
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            Datos.LeyMultiplicacionSR();
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            break;
                                                        case 3:
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Usted eligio salir.");
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            break;
                                                        default:
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println("Ingrese un numero valido.");
                                                            System.out.println("---------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                    }
                                                }while(seleccion!=3 | seleccion-Math.round(seleccion)!=0);
                                                break;
                                            case 4:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Usted eligio salir.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            default:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese un numero valido.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                        }
                                    }while(seleccion!=4 | seleccion-Math.round(seleccion)!=0);
                                    break;
                                case 6:
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Ingrese los datos para la ecuacion estimada 'y'");
                                        System.out.println("1. Ingresar los datos de X: ");
                                        System.out.println("2. Ingresar los datos de Y: ");
                                        System.out.println("3. Calcular 'b' ");
                                        System.out.println("4. Calcular 'a' (solo tras haber calculado antes 'b').");
                                        System.out.println("5. Calcular 'y' (tras obtener 'b' y 'a'). ");
                                        System.out.println("6. Salir.");
                                        System.out.print("Opcion: ");
                                        seleccion=input.nextDouble();
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        switch((int)seleccion){
                                            case 1:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese los datos: ");
                                                Datos.setXB(input.nextDouble());
                                                EstaDatosXB.add(Datos.getXB());
                                                System.out.println("Sus datos ingresados son: ");
                                                for (Double DatosArray: EstaDatosXB ){
                                                    System.out.println(DatosArray+ " ");
                                                }
                                                Datos.calcularXB(EstaDatosXB);
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 2: 
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese los datos: ");
                                                Datos.setYB(input.nextDouble());
                                                EstaDatosYB.add(Datos.getYB());
                                                System.out.println("Sus datos ingresados son: ");
                                                for (Double DatosArray: EstaDatosYB ){
                                                    System.out.println(DatosArray+ " ");
                                                }
                                                Datos.calcularYB(EstaDatosYB);
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 3:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese la cantidad de datos: ");
                                                Datos.setnB(input.nextDouble());
                                                Datos.calcularB(EstaDatosXB, EstaDatosYB);
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 4:
                                                System.out.println("---------------------------------------------------------------------------");
                                                Datos.calcularA();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 5:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese el valor para X que desee: ");
                                                Datos.setXpY(input.nextDouble());
                                                Datos.calcularY();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 6:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Usted eligio salir.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            default:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese un numero valido.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                        }
                                    }while(seleccion!=6 | seleccion-Math.round(seleccion)!=0);
                                    break;
                                case 7:
                                    do{
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println("Seleccione lo que desea hacer: ");
                                        System.out.println("1. Caluclar la puntuacion Z para la distribucion normal estandar con una indicacion (ejm: que sea mayor o menor a...)");
                                        System.out.println("2. Caluclar la puntuacion Z para la distribucion normal estandar con una indicacion intermedia (ejm: que sea mayor a... y menor a...)");
                                        System.out.println("3. Caluclar la puntuacion Z para la distribucion normal estandar considerando una muestra.");
                                        System.out.println("4. Realizar prueba de hipotesis.");
                                        System.out.println("5. Salir.");
                                        System.out.print("Opcion: ");
                                        seleccion=input.nextDouble();
                                        System.out.println("---------------------------------------------------------------------------");
                                        System.out.println(" ");
                                        switch((int)seleccion){
                                            case 1: 
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese la variable X.");
                                                Datos.setxDE(input.nextDouble());
                                                System.out.println("Ingrese el promedio poblacional.");
                                                Datos.setpP(input.nextDouble());
                                                System.out.println("Ingrese la varianza poblacional.");
                                                Datos.setvP(input.nextDouble());
                                                Datos.DistribucionEstandarNormal();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 2: 
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese la variable X1.");
                                                Datos.setxDE(input.nextDouble());
                                                System.out.println("Ingrese el promedio poblacional.");
                                                Datos.setpP(input.nextDouble());
                                                System.out.println("Ingrese la varianza poblacional.");
                                                Datos.setvP(input.nextDouble());
                                                System.out.println(" ");
                                                System.out.println("Ingrese la variable X2.");
                                                Datos.setxDE2(input.nextDouble());
                                                System.out.println("Ingrese el promedio poblacional.");
                                                Datos.setpP2(input.nextDouble());
                                                System.out.println("Ingrese la varianza poblacional.");
                                                Datos.setvP2(input.nextDouble());
                                                Datos.DistribucionEstandarNormal2();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 3: 
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese el promedio muestral.");
                                                Datos.setPM(input.nextDouble());
                                                System.out.println("Ingrese el promedio poblacional.");
                                                Datos.setpP(input.nextDouble());
                                                System.out.println("Ingrese la varianza poblacional.");
                                                Datos.setvP(input.nextDouble());
                                                System.out.println("Ingrese la el tamanio de la muestra.");
                                                Datos.setTM(input.nextDouble());
                                                Datos.DistribucionEstandarNormalMuestral();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            case 4: 
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese el promedio muestral.");
                                                Datos.setPM(input.nextDouble());
                                                System.out.println("Ingrese el promedio poblacional.");
                                                Datos.setpP(input.nextDouble());
                                                System.out.println("Ingrese la varianza poblacional.");
                                                Datos.setvP(input.nextDouble());
                                                System.out.println("Ingrese la el tamanio de la muestra.");
                                                Datos.setTM(input.nextDouble());
                                                System.out.println("Ingrese el nivel de significancia.");
                                                Datos.setSF(input.nextDouble());
                                                System.out.println("Ingrese cuantas zonas de valor tiene su caso.");
                                                Datos.setSv(input.nextDouble());
                                                Datos.DistribucionEstandarHipotesis();
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;   
                                            case 5:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Usted selecciono salir.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                            default:
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println("Ingrese un numero valido.");
                                                System.out.println("---------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                break;
                                        }
                                    }while(seleccion!=5 | seleccion-Math.round(seleccion)!=0);
                                    break;
                                case 8:
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Usted selecciono salir.");
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println(" ");
                                    break;
                                default:
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println("Ingrese datos validos.");
                                    System.out.println("---------------------------------------------------------------------------");
                                    System.out.println(" ");
                                    break;
                            }
                        }while(seleccion!=8 | seleccion-Math.round(seleccion)!=0);
                        break;
                    case 3:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Usted eligio salir.");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Ingrese una opcion valida.");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println(" ");
                        break;
                }
        }while(seleccion2!=3 | seleccion2-Math.round(seleccion2)!=0);
    }
}
