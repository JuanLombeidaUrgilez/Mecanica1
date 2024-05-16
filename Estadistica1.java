
package com.mycompany.jssu.estadisticamain1;

import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica1 {
    private double vo;
    private double t;
    private double vf;
    private double x;
    private double ang;
    private double y;
    private double voy;
    private double vox;
    private double g = 9.81;
    private double tmax;
    private double vy;
    private double ymax;
    private double xx;
    private double xy;
    private double tv;

    private double prom;
   
    public Estadistica1() {
    }
    Scanner input= new Scanner(System.in);
    public Estadistica1(double vo, double t, double vf, double x, double ang, double y, double voy, double vox, double tmax, double vy, double ymax, double xx, double xy, double tv) {
        this.vo = vo;
        this.t = t;
        this.vf = vf;
        this.x = x;
        this.ang = ang;
        this.y = y;
        this.voy = voy;
        this.vox = vox;
        this.tmax = tmax;
        this.vy = vy;
        this.ymax = ymax;
        this.xx = xx;
        this.xy = xy;
        this.tv = tv;
    }
    public double getVo() {
        return vo;
    }

    public void setVo(double vo) {
        this.vo = vo;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getAng() {
        return ang;
    }

    public void setAng(double ang) {
        this.ang = ang;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVoy() {
        return voy;
    }

    public void setVoy(double voy) {
        this.voy = voy;
    }

    public double getVox() {
        return vox;
    }

    public void setVox(double vox) {
        this.vox = vox;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public double getYmax() {
        return ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public double getXx() {
        return xx;
    }

    public void setXx(double xx) {
        this.xx = xx;
    }

    public double getXy() {
        return xy;
    }

    public void setXy(double xy) {
        this.xy = xy;
    }

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }

    
    //inclinado
    
    public void componenteHorizontal(ArrayList<Double>EstaDatosVx){
        double Vox;
        Vox = getVo() * Math.cos(Math.toRadians(getAng()));
        System.out.println("La velocidad en x es: "+ Vox);
        EstaDatosVx.add(Vox);
    }
    public void componenteVertical(ArrayList<Double>EstaDatosVoy){
        double Voy;
        Voy = getVo() * Math.sin(Math.toRadians(getAng()));
        System.out.println("La velocidad inical en y es: "+ Voy);
        EstaDatosVoy.add(Voy);
    }
    public void componenteVerticalPuntos(ArrayList<Double>EstaDatosVy){
        double Vy;
        Vy = getVoy() - this.g * getT();
        System.out.println("La velocidad en y es: "+ Vy);
        EstaDatosVy.add(Vy);
    }
    public void MagnitudVelocidad(ArrayList<Double>EstaDatosVM){
        double VM;
        VM = Math.sqrt(Math.pow(getVox(), 2)+ Math.pow(getVy(), 2));
        System.out.println("La magnitud de la velocidad es: "+ VM);
        EstaDatosVM.add(VM);
    }
    public void DireccionVelocidad(ArrayList<Double>EstaDatosDV){
        double AngV;
        AngV = Math.toDegrees(Math.atan2(getVy(),getVox()));
        System.out.println("La direccion de la velocidad es: "+ AngV);
        EstaDatosDV.add(AngV);
    }
    public void DesplazamientoHorizontal(ArrayList<Double>EstaDatosXx){
        double Xx;
        Xx = getVox()* getT();
        System.out.println("El desplazamiento en x es: "+ Xx);
        EstaDatosXx.add(Xx);
    }
    public void DesplazamientoVertical(ArrayList<Double>EstaDatosXy){
        double Xy;
        Xy = getVoy() * getT() - (((this.g*Math.pow(getT(),2)))/2);
        System.out.println("El desplazamiento en y es: "+ Xy);
        EstaDatosXy.add(Xy);
    }
    public void DesplazamientoHorizontalMaximo(ArrayList<Double>EstaDatosXmax){
        double Xmax;
        Xmax= getVox() * getTv();
        System.out.println("El desplazamiento maximo en x es: "+ Xmax);
        EstaDatosXmax.add(Xmax);
    }
    public void DesplazamientoVerticalMaximo(ArrayList<Double>EstaDatosYmax){
        double Ymax;
        Ymax= Math.pow(getVoy(),2) / (2*this.g);
        System.out.println("El desplazamiento maximo en y es: "+ Ymax);
        EstaDatosYmax.add(Ymax);
    }
    public void TiempoMaximo(ArrayList<Double>EstaDatosTmax){
        double Tmax;
        Tmax= getVoy() / this.g;
        System.out.println("El tiempo en llegar al punto del altura maxima del trayecto es: "+ Tmax);
        EstaDatosTmax.add(Tmax);
    }
    public void TiempoVuelo(ArrayList<Double>EstaDatosTv){
        double Tv;
        Tv= 2* getTmax();
        System.out.println("El tiempo de vuelo es de: "+ Tv);
        EstaDatosTv.add(Tv);
    }
    //horizontal
    public void componenteHorizontalH(ArrayList<Double>EstaDatosVxH){
        double Vx;
        Vx = getVo();
        System.out.println("La velocidad en x es: "+ Vx);
        EstaDatosVxH.add(Vx);
    }
    public void componenteVerticalH(ArrayList<Double>EstaDatosVyH){
        double Vy;
        Vy = g * getT();
        System.out.println("La velocidad en y es: "+ Vy);
        EstaDatosVyH.add(Vy);
    }
    public void DireccionDesplazamiento(ArrayList<Double>EstaDatosDDH){
        double AngD;
        AngD = Math.toDegrees(Math.atan2(getXy(),getXx()));
        System.out.println("La direccion del desplazamiento es: "+ AngD);
        EstaDatosDDH.add(AngD);
    }
    public void DesplazamientoHorizontalH(ArrayList<Double>EstaDatosXxH){
        double Xx;
        Xx = getVo()* getT();
        System.out.println("El desplazamiento en x es: "+ Xx);
        EstaDatosXxH.add(Xx);
    }
    public void DesplazamientoVerticalH(ArrayList<Double>EstaDatosXyH){
        double Xy;
        Xy = (g * Math.pow(getT(),2))/2;
        System.out.println("El desplazamiento en y es: "+ Xy);
        EstaDatosXyH.add(Xy);
    }
    public void DesplazamientoTotalH(ArrayList<Double>EstaDatosDTH){
        double Xmax;
        Xmax= Math.sqrt((Math.pow(getXx(), 2)+Math.pow(getXy(), 2)));
        System.out.println("El desplazamiento total es: "+ Xmax);
        EstaDatosDTH.add(Xmax);
    }
    public void DesplazamientoHorizontalMaximoH(ArrayList<Double>EstaDatosXmaxH){
        double Xmax;
        Xmax= getVox()* getTv();
        System.out.println("El desplazamiento en maximo en X es: "+ Xmax);
        EstaDatosXmaxH.add(Xmax);
    }
    public void TiempoVueloH(ArrayList<Double>EstaDatosTVH){
        double TV;
        TV= Math.sqrt((2* getYmax() / g));
        System.out.println("El tiempo de vuelo del trayecto es: "+ TV);
        EstaDatosTVH.add(TV);
    }
    public void MagnitudVelocidadH(ArrayList<Double>EstaDatosVMH){
        double VM;
        VM = Math.sqrt(Math.pow(getVox(), 2)+ Math.pow(getVy(), 2));
        System.out.println("La magnitud de la velocidad es: "+ VM);
        EstaDatosVMH.add(VM);
    }
    public void AlturaEnFuncionDelTiempo(ArrayList<Double>EstaDatosYPH){
        double Yt;
        Yt= getYmax() - (g * Math.pow(getT(),2))/2;
        System.out.println("La posicion en Y es: "+ Yt);
        EstaDatosYPH.add(Yt);
    }
    // Estadistica

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
        
    }
    
    public void Media(ArrayList<Double>EstaDatosMedia){
        double prom=0;
        int i=1;
        double media;
        for(Double Datos: EstaDatosMedia){
            prom= Datos+prom;
            if((i)==(EstaDatosMedia.size())){
                media=prom/(i);
                System.out.println("La media es: "+ media+ ". ");
            }
            i++;
        }   
    }
    public void MediaX(ArrayList<Double>EstaDatos){
        double prom=0;
        int i=1;
        double media;
        for(Double Datos: EstaDatos){
            prom= Datos+prom;
            if((i)==(EstaDatos.size())){
                media=prom/(i);
                System.out.println("La media es: "+ media+ ". ");
            }
            i++;
        }   
    }
    private double mediana1;

    public double getMediana1() {
        return mediana1;
    }

    public void setMediana1(double mediana1) {
        this.mediana1 = mediana1;
    }
    
    public void Mediana(ArrayList<Double>EstaDatosMediana){
        double mitad=0, mitad2;
        int i=1;
        double mediana, mediana2, mediana3;
        mitad=EstaDatosMediana.size()/2;
        if(EstaDatosMediana.size()%2!=0){
            mediana=EstaDatosMediana.get((int)mitad);
            System.out.println("La mediana es: "+ mediana);
        }else{
            mitad2= mitad-(mitad-Math.round(mitad));
            mediana=EstaDatosMediana.get((int)mitad2);
            mediana2=EstaDatosMediana.get((int)(mitad2-1));
            mediana3= (mediana+mediana2)/2;
            System.out.println("La mediana es: "+ mediana3);
        }  
    }
    private double moda1;

    public double getModa1() {
        return moda1;
    }

    public void setModa1(double moda1) {
        this.moda1 = moda1;
    }
    
    
    public void Moda(ArrayList<Double>EstaDatosModa){
        int i=0, j=0;
        double  contador, moda=0, bandera;
        
        double datoDeComprobacion=0;
//        for(Double Datos: EstaDatosModa){
//            contador=0;
//            for(i=0; i <EstaDatosModa.size(); i++){
//                if(EstaDatosModa.get(i)==Datos){
//                    contador=contador+1;
//                } 
//            }
//            if(contador>datoDeComprobacion & i<EstaDatosModa.size()){
//                    datoDeComprobacion= contador;
//                    moda=EstaDatosModa.get(i);
//                        System.out.println(contador);
//                        System.out.println("La moda es: "+ moda);
//                    
//                }
//            i++;
//        }       
          for (i=0; i<EstaDatosModa.size();i++){
              contador=0;
              bandera = EstaDatosModa.get(i);
              for(j=0; j<EstaDatosModa.size();j++){
                  if(bandera==EstaDatosModa.get(j)){
                      contador++;
                  }
                  if(contador>datoDeComprobacion){
                      datoDeComprobacion=contador;
                      moda= bandera;
                  }
                  if(contador==datoDeComprobacion){
                      datoDeComprobacion=contador;
                      moda= bandera;
              }
              
          }
          System.out.println("La moda es: "+ moda+".");
    }
    }
    private double CF;
    private double CP;

    public double getCF() {
        return CF;
    }

    public void setCF(double CF) {
        this.CF = CF;
    }

    public double getCP() {
        return CP;
    }

    public void setCP(double CP) {
        this.CP = CP;
    }
    
    public void probabilidadMatematica(){
        double probMat;
        probMat= getCF()/getCP();
        System.out.println("La probabilidad matematica es: "+ probMat);
    }
    private double xDE;
    private double pP;
    private double vP;

    public double getxDE() {
        return xDE;
    }

    public void setxDE(double xDE) {
        this.xDE = xDE;
    }

    public double getpP() {
        return pP;
    }

    public void setpP(double pP) {
        this.pP = pP;
    }

    public double getvP() {
        return vP;
    }

    public void setvP(double vP) {
        this.vP = vP;
    }
    
    private double xDE2;
    private double pP2;
    private double vP2;

    public double getxDE2() {
        return xDE2;
    }

    public void setxDE2(double xDE2) {
        this.xDE2 = xDE2;
    }

    public double getpP2() {
        return pP2;
    }

    public void setpP2(double pP2) {
        this.pP2 = pP2;
    }

    public double getvP2() {
        return vP2;
    }

    public void setvP2(double vP2) {
        this.vP2 = vP2;
    }
    
    public void DistribucionEstandarNormal(){
        double z;
       z= (getxDE()-getpP())/getvP();
        System.out.println("La puntuacion z es: "+ z);
    }
    public void DistribucionEstandarNormal2(){
        double z, z2, zT;
        z= (getxDE()-getpP())/getvP();
        System.out.println("La puntuacion z1 es: "+ z+".");
       z2= (getxDE2()-getpP2())/getvP2();
        System.out.println("La puntuacion z2 es: "+ z2+".");
        if(z<0){
            zT= z2-(-1*z);
            System.out.println("La puntuacion zT es:"+ zT+".");
        }else{
            if(z2<0){
                zT= (-1*z2)-z;
                System.out.println("La puntuacion zT es:"+ zT+".");
            }
        }
    }
    private double PM;
    private double TM;
    private double SF;
    private double Sv;

    public double getSv() {
        return Sv;
    }

    public void setSv(double Sv) {
        this.Sv = Sv;
    }
    public double getSF() {
        return SF;
    }

    public void setSF(double SF) {
        this.SF = SF;
    }
    public double getPM() {
        return PM;
    }

    public void setPM(double PM) {
        this.PM = PM;
    }

    public double getTM() {
        return TM;
    }

    public void setTM(double TM) {
        this.TM = TM;
    }
    
    public void DistribucionEstandarNormalMuestral(){
        double z, o;
        z= (getPM()-getpP())/(getvP()/Math.sqrt(getTM()));
        o= 1-z;
        if(o<0){
            System.out.println("La puntuacion z es: "+ z + " y su complemento restante es de: "+ (-1*o)+".");
        }else{
            System.out.println("La puntuacion z es: "+ z + " y su complemento restante es de: "+ o+".");
        }
    }
    public void DistribucionEstandarHipotesis(){
        double z, o, o2;
        z= (getPM()-getpP())/(getvP()/Math.sqrt(getTM()));
        o= 1-getSF();
        o2= 0.5-(getSF()/2);
        if(getSv()>1){
            if(o<0){
                System.out.println("La puntuacion z es: "+ z + " y su zona de aceptacion es de: "+ (-1*o)+", tambien puede servirle la zona de aceptacion desde la mitad de la grafica que es equivalente a: "+o2+".");
                System.out.println("Compare la tabla Z en internet y vea si acepta la hipotesis nula o si la rechaza.");
            }else{
                System.out.println("La puntuacion z es: "+ z + " y su zona de aceptacion es de: "+ o+ ", tambien puede servirle la zona de aceptacion desde la mitad de la grafica que es equivalente a: "+o2+".");
                System.out.println("Compare la tabla Z en internet y vea si acepta la hipotesis nula o si la rechaza.");
            }
        }else{
            if(o<0){
                System.out.println("La puntuacion z es: "+ z + " y su zona de aceptacion es de: "+ (-1*o)+" tambien puede servirle la zona de aceptacion desde la mitad de la grafica que es equivalente a: "+o2+".");
                System.out.println("Compare la tabla Z en internet y vea si acepta la hipotesis nula o si la rechaza.");
            }else{
                System.out.println("La puntuacion z es: "+ z + " y su zona de aceptacion es de: "+ o+" tambien puede servirle la zona de aceptacion desde la mitad de la grafica que es equivalente a: "+o2+".");
                System.out.println("Compare la tabla Z en internet y vea si acepta la hipotesis nula o si la rechaza.");
            }
        }
    }
    private double XB;
    private double YB;
    private double nB;

    public double getXB() {
        return XB;
    }

    public void setXB(double XB) {
        this.XB = XB;
    }

    public double getYB() {
        return YB;
    }

    public void setYB(double YB) {
        this.YB = YB;
    }

    public double getnB() {
        return nB;
    }

    public void setnB(double nB) {
        this.nB = nB;
    }
    private double prom2;
    private double prom3;

    public double getProm2() {
        return prom2;
    }

    public void setProm2(double prom2) {
        this.prom2 = prom2;
    }

    public double getProm3() {
        return prom3;
    }

    public void setProm3(double prom3) {
        this.prom3 = prom3;
    }
    
    public void calcularXB(ArrayList<Double>EstaDatosXB){
        double promB=0, prom2;
        int i=1;
        for(Double Datos: EstaDatosXB){
            promB= Datos+promB;
            if((i)==(EstaDatosXB.size())){
                prom2=promB/(i);
                setProm2(prom2);
                System.out.println("El promedio de los datos en X es: "+ prom2+ ". ");
            }
            i++;
        }   
    }
    public void calcularYB(ArrayList<Double>EstaDatosYB){
        double promB=0, prom3;
        int i=1;
        for(Double Datos: EstaDatosYB){
            promB= Datos+promB;
            if((i)==(EstaDatosYB.size())){
                prom3=promB/(i);
                setProm3(prom3);
                System.out.println("El promedio de los datos en Y es: "+ prom3+ ". ");
            }
            i++;
        }   
    }
    private double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void calcularB(ArrayList<Double>EstaDatosXB, ArrayList<Double>EstaDatosYB){
        double mul, sum=0, mul2, arriba, mul3=0, mul4, abajo, b;
        int i=0;
        for(i=0; i<EstaDatosXB.size();i++){
            mul= EstaDatosXB.get(i)*EstaDatosYB.get(i);
            sum= mul+ sum;
        }  
        mul2= getnB()*(getProm2()*getProm3());
        arriba=sum-mul2;
        for (double Datos: EstaDatosXB){
            mul3= Math.pow(Datos, 2)+mul3;
        }
        mul4=getnB()*Math.pow(getProm2(), 2);
        abajo= mul3-mul4;
        b= arriba/abajo;
        setB(b);
        System.out.println("El valor de 'b' es: "+ b +". ");
    }
    private double a;
    private double XpY;

    public double getXpY() {
        return XpY;
    }

    public void setXpY(double XpY) {
        this.XpY = XpY;
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public void calcularA(){
        double a;
        a=getProm3()-(getB()*getProm2());
        setA(a);
        System.out.println("El valor de 'a' es: "+a+". ");
    }
    public void calcularY(){
        double y;
        y=getA()+(getB()*getXpY());
        System.out.println("El valor de 'y' cuando X es: "+getXpY()+", es: "+y+". ");
    }
    
    
    public void Complemento(){
        double Cc;
        System.out.println("Ingrese el numero de casos favorables: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles: ");
        setCP(input.nextDouble());
        Cc= 1-(getCF()/getCP());
        System.out.println("El complemento es: "+ Cc+".");
    }
    public void LeySuma(){
        double Cc, Cc2, Cc3,Cc4;
        System.out.println("Ingrese el numero de casos favorables para A: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles para A: ");
        setCP(input.nextDouble());
        Cc= (getCF()/getCP());
        System.out.println("Ingrese el numero de casos favorables para B: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles para B: ");
        setCP(input.nextDouble());
        Cc2= (getCF()/getCP());
        Cc3= Cc*Cc2;
        Cc4 = Cc+ Cc2- Cc3;
        System.out.println("El resultado de (AuB) es: "+ Cc4+".");
    }
    public void LeyMultiplicacionR(){
        double Cc, Cc2, Cc3,Cc4;
        System.out.println("Ingrese el numero de casos favorables para A: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles para A: ");
        setCP(input.nextDouble());
        Cc= (getCF()/getCP());
        System.out.println("Ingrese el numero de casos favorables para B: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles para B: ");
        setCP(input.nextDouble());
        Cc2= (getCF()/getCP());
        Cc3= Cc*Cc2;
        System.out.println("El resultado de (AnB) es: "+ Cc3+".");
    }
    public void LeyMultiplicacionSR(){
        double Cc, Cc2, Cc3,Cc4;
        System.out.println("Ingrese el numero de casos favorables para A: ");
        setCF(input.nextDouble());
        System.out.println("Ingrese el numero de casos posibles para A: ");
        setCP(input.nextDouble());
        Cc= (getCF()/getCP());
        System.out.println("Ingrese el numero de casos favorables para B: ");
        setCF(input.nextDouble());
        Cc2= (getCF()/(getCP()-1));
        Cc3= Cc*Cc2;
        System.out.println("El resultado de (AnB) es: "+ Cc3+".");
    }
}
