package jp.sample;

import jp.sample.ano.SampleAnnotation;

public class AnoSample2 {
  public static void main(String[] args){
    AnoSample2 my = new AnoSample2();
    my.show("AnoSample2");
  }


  @SampleAnnotation("fugaMapping")
  public void show(String message){
    System.out.println(message);
  }
}