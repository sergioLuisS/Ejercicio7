package edu.ejercicios;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        package P2;

import pkgAlumno.Alumno;
import pkgAlumno.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                List<CursoAsignado> cat_cursos = new ArrayList<>();
                cat_cursos.add(new CursoAsignado(101, "Programacion ", 500.1));
                cat_cursos.add(new CursoAsignado(105, "Derecho  ", 1));
                cat_cursos.add(new CursoAsignado(110, "Estaditica ", 450));
                cat_cursos.add(new CursoAsignado(120, "Electronica ", 400));



//        CursoAsignado curso1 = new CursoAsignado(101, "Programacion ", 500.1);
//        CursoAsignado curso2 = new CursoAsignado(105, "Derecho  ", 1);
//        CursoAsignado curso3 = new CursoAsignado(110, "Estaditica ", 450);
//        CursoAsignado curso4 = new CursoAsignado(120, "Electronica ", 400);




                Alumno al1 = new Alumno("2023015", "Andrea", "12345678", "San Jose Acatempa");
                al1.agregarCursoAsignado(cat_cursos.get(1));
                al1.agregarCursoAsignado(cat_cursos.get(2));
                // al1.mostrarInformacion();
                System.out.println("Total  del alumno"+al1.getNombre()+"Q."+al1.getTotalCurso());


                Alumno al2 = new Alumno("2023016", "Monica", "12345678", "JUtiipa");
                al2.agregarCursoAsignado( cat_cursos.get(0));
                al2.agregarCursoAsignado(cat_cursos.get(3));
                al2.agregarCursoAsignado(cat_cursos.get(1));
                // al2.mostrarInformacion();
                System.out.println("Total  del alumno"+al2.getNombre()+"Q."+al2.getTotalCurso());

                Alumno alu3 = new Alumno("2023017", "Maria", "12345678", "Quesada");
                alu3.agregarCursoAsignado(cat_cursos.get(0));
                alu3.agregarCursoAsignado(cat_cursos.get(1));
                alu3.agregarCursoAsignado(cat_cursos.get(2));
                //alu3.mostrarInformacion();
                System.out.println("Total  del alumno"+alu3.getNombre()+"Q."+alu3.getTotalCurso());

                Alumno alu4 = new Alumno("2023018", "Jose", "12345678", "Comapa");
                alu4.agregarCursoAsignado(cat_cursos.get(3));
                alu4.agregarCursoAsignado(cat_cursos.get(2));
                alu4.agregarCursoAsignado(cat_cursos.get(1));
                // alu4.mostrarInformacion();
                System.out.println("Total  del alumno"+alu4.getNombre()+"Q."+alu4.getTotalCurso());
//        double to =0;
//        for (CursoAsignado curso : al1.getCursoAsignado()) {
//            System.out.println("Nombre del curso"+curso.getNombreCurso());
//            System.out.println("curso"+curso.getCodigoCurso());
//            to = to + curso.getCostoCurso();
//        }
//        System.out.println("alumno"+al1.getNombre()+ "paga total"+to);
//        to =0;
                System.out.println("Total de todos los alumnos");
                System.out.println(+al1.getTotalCurso()+al2.getTotalCurso()+alu3.getTotalCurso()+alu4.getTotalCurso());
            }

        }
        }
    }
}