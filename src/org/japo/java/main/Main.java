/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constante
            final String SALUDO_CONSTANTE = "Hola Mundo";

        //1º MANERA
            System.out.println("- " + SALUDO_CONSTANTE);    //System es una clase,out es un recurso de la clase System. el punto indica el recurso.  

        //2º MANERA
            System.out.printf("- %s%n",SALUDO_CONSTANTE);
        
        
    }//main

}//class
