/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.Jornada;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import jems.JEMS;

/**
 * Ventana para introducir el resultado de los partidos.
 *
 * @author Miguel Barros
 * @author Sergio Zulueta
 * @author Eric Muñoz * @version %I%, %G%
 * @since 1.0
 */
public class V_IntroducirResultado extends javax.swing.JFrame {

    private int codEquipo;
    private ArrayList<Jornada> listaJornadas;
    private int num;

    /**
     * Coonstructor introducir resultado.
     *
     */
    public V_IntroducirResultado() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
    }

    /**
     * Funciones personalizadas.
     *
     */
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfNumJornada.setBorder(BorderFactory.createCompoundBorder(
                tfNumJornada.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoLocal.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoLocal2.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal2.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoLocal3.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal3.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante2.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante2.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante3.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante3.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Constructor personalizado.
     *
     * @param jornadas (requerido) todas las jornadas
     * @param numJornada (requerido) numero de jornada
     */
    public V_IntroducirResultado(ArrayList<Jornada> jornadas, int numJornada) {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        listaJornadas = jornadas;
        num = numJornada - 1;
        rbGanadorLocal.setEnabled(true);
        rbGanadorVisitante.setEnabled(true);
        rbGanadorLocal2.setEnabled(true);
        rbGanadorVisitante2.setEnabled(true);
        rbGanadorLocal3.setEnabled(true);
        rbGanadorVisitante3.setEnabled(true);
        switch (numJornada) {
            case 1:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(0).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(0).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(0).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 2:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(1).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(1).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(1).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }

                break;
            case 3:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(2).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(2).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(2).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 4:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(3).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(3).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(3).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 5:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(4).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(4).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(4).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 6:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(5).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(5).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(5).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 7:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(6).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(6).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(6).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 8:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(7).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(7).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(7).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 9:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(8).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(8).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(8).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                }
                break;
            case 10:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(9).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(9).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(9).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_visitante().getNombre());
                for (int x = 0; x < jornadas.get(num).getPartidos().size(); x++) {
                    if (jornadas.get(num).getPartidos().get(x).getResultado() != 0) {
                        switch (x) {
                            case 0:
                                rbGanadorLocal.setEnabled(false);
                                rbGanadorVisitante.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal.setSelected(true);
                                } else {
                                    rbGanadorVisitante.setSelected(true);
                                }
                                break;
                            case 1:
                                rbGanadorLocal2.setEnabled(false);
                                rbGanadorVisitante2.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal2.setSelected(true);
                                } else {
                                    rbGanadorVisitante2.setSelected(true);
                                }
                                break;
                            case 2:
                                rbGanadorLocal3.setEnabled(false);
                                rbGanadorVisitante3.setEnabled(false);
                                if (jornadas.get(num).getPartidos().get(x).getResultado() == jornadas.get(num).getPartidos().get(x).getEquipo_local().getCod_equipo()) {
                                    rbGanadorLocal3.setSelected(true);
                                } else {
                                    rbGanadorVisitante3.setSelected(true);
                                }
                                break;
                        }
                    }
                    break;
                }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        tfNumJornada = new javax.swing.JTextField();
        tfEquipoLocal = new javax.swing.JTextField();
        tfEquipoLocal2 = new javax.swing.JTextField();
        tfEquipoLocal3 = new javax.swing.JTextField();
        tfEquipoVisitante3 = new javax.swing.JTextField();
        tfEquipoVisitante2 = new javax.swing.JTextField();
        tfEquipoVisitante = new javax.swing.JTextField();
        lbVS = new javax.swing.JLabel();
        lbVS3 = new javax.swing.JLabel();
        lbVS2 = new javax.swing.JLabel();
        rbGanadorVisitante = new javax.swing.JRadioButton();
        rbGanadorVisitante2 = new javax.swing.JRadioButton();
        rbGanadorVisitante3 = new javax.swing.JRadioButton();
        rbGanadorLocal = new javax.swing.JRadioButton();
        rbGanadorLocal2 = new javax.swing.JRadioButton();
        rbGanadorLocal3 = new javax.swing.JRadioButton();
        bActualizar = new javax.swing.JButton();
        lbCodigoDueño = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundIntroducirResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfNumJornada.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNumJornada.setForeground(new java.awt.Color(0, 0, 0));
        tfNumJornada.setEnabled(false);
        getContentPane().add(tfNumJornada);
        tfNumJornada.setBounds(640, 250, 40, 30);

        tfEquipoLocal.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal.setEnabled(false);
        tfEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEquipoLocalActionPerformed(evt);
            }
        });
        getContentPane().add(tfEquipoLocal);
        tfEquipoLocal.setBounds(370, 310, 250, 30);

        tfEquipoLocal2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal2.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal2.setEnabled(false);
        getContentPane().add(tfEquipoLocal2);
        tfEquipoLocal2.setBounds(370, 360, 250, 30);

        tfEquipoLocal3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal3.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal3.setEnabled(false);
        getContentPane().add(tfEquipoLocal3);
        tfEquipoLocal3.setBounds(370, 410, 250, 30);

        tfEquipoVisitante3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante3.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante3.setEnabled(false);
        getContentPane().add(tfEquipoVisitante3);
        tfEquipoVisitante3.setBounds(700, 410, 250, 30);

        tfEquipoVisitante2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante2.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante2.setEnabled(false);
        getContentPane().add(tfEquipoVisitante2);
        tfEquipoVisitante2.setBounds(700, 310, 250, 30);

        tfEquipoVisitante.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante.setEnabled(false);
        getContentPane().add(tfEquipoVisitante);
        tfEquipoVisitante.setBounds(700, 360, 250, 30);

        lbVS.setForeground(new java.awt.Color(255, 255, 255));
        lbVS.setText("- v -");
        getContentPane().add(lbVS);
        lbVS.setBounds(650, 310, 20, 30);

        lbVS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVS3.setText("- v -");
        getContentPane().add(lbVS3);
        lbVS3.setBounds(650, 360, 20, 30);

        lbVS2.setForeground(new java.awt.Color(255, 255, 255));
        lbVS2.setText("- v -");
        getContentPane().add(lbVS2);
        lbVS2.setBounds(650, 410, 20, 30);

        buttonGroup1.add(rbGanadorVisitante);
        rbGanadorVisitante.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorVisitante.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorVisitante.setText("Ganador");
        rbGanadorVisitante.setContentAreaFilled(false);
        getContentPane().add(rbGanadorVisitante);
        rbGanadorVisitante.setBounds(960, 310, 110, 28);

        buttonGroup2.add(rbGanadorVisitante2);
        rbGanadorVisitante2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorVisitante2.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorVisitante2.setText("Ganador");
        rbGanadorVisitante2.setContentAreaFilled(false);
        getContentPane().add(rbGanadorVisitante2);
        rbGanadorVisitante2.setBounds(960, 360, 100, 28);

        buttonGroup3.add(rbGanadorVisitante3);
        rbGanadorVisitante3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorVisitante3.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorVisitante3.setText("Ganador");
        rbGanadorVisitante3.setContentAreaFilled(false);
        getContentPane().add(rbGanadorVisitante3);
        rbGanadorVisitante3.setBounds(960, 410, 90, 28);

        buttonGroup1.add(rbGanadorLocal);
        rbGanadorLocal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorLocal.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorLocal.setText("Ganador");
        rbGanadorLocal.setContentAreaFilled(false);
        rbGanadorLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGanadorLocalActionPerformed(evt);
            }
        });
        getContentPane().add(rbGanadorLocal);
        rbGanadorLocal.setBounds(270, 310, 90, 28);

        buttonGroup2.add(rbGanadorLocal2);
        rbGanadorLocal2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorLocal2.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorLocal2.setText("Ganador");
        rbGanadorLocal2.setContentAreaFilled(false);
        getContentPane().add(rbGanadorLocal2);
        rbGanadorLocal2.setBounds(270, 360, 100, 28);

        buttonGroup3.add(rbGanadorLocal3);
        rbGanadorLocal3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        rbGanadorLocal3.setForeground(new java.awt.Color(255, 255, 255));
        rbGanadorLocal3.setText("Ganador");
        rbGanadorLocal3.setContentAreaFilled(false);
        getContentPane().add(rbGanadorLocal3);
        rbGanadorLocal3.setBounds(270, 410, 90, 28);

        bActualizar.setBackground(new java.awt.Color(252, 124, 0));
        bActualizar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bActualizar.setForeground(new java.awt.Color(255, 255, 255));
        bActualizar.setText("ACTUALIZAR");
        bActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bActualizar.setBorderPainted(false);
        bActualizar.setFocusPainted(false);
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bActualizar);
        bActualizar.setBounds(500, 540, 280, 50);

        lbCodigoDueño.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbCodigoDueño.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoDueño.setText("Selecciona la Jornada a Modificar");
        getContentPane().add(lbCodigoDueño);
        lbCodigoDueño.setBounds(530, 210, 280, 40);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("EDITAR JORNADAS");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(350, 70, 610, 60);

        bVolver.setBackground(new java.awt.Color(86, 88, 149));
        bVolver.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("VOLVER");
        bVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolver.setBorderPainted(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.setFocusPainted(false);
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(560, 630, 170, 30);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.setFocusPainted(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(1230, 10, 40, 40);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(250, 200, 820, 290);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/introducir_resultado_background.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundIntroducirResultado.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundIntroducirResultado.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundIntroducirResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundIntroducirResultado);
        lbBackgroundIntroducirResultado.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEquipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEquipoLocalActionPerformed
    /**
     * Actualizar los partidos.
     *
     * @param evt accion de clickar
     */
    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        try {
            if (rbGanadorLocal.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoLocal.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(0).getEquipo_local().getCod_equipo());
                rbGanadorLocal.setEnabled(false);
                rbGanadorVisitante.setEnabled(false);
            } else if (rbGanadorVisitante.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoVisitante2.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(0).getEquipo_local().getCod_equipo());
                rbGanadorLocal.setEnabled(false);
                rbGanadorVisitante.setEnabled(false);
            }
            if (rbGanadorLocal2.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoLocal2.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(1).getEquipo_local().getCod_equipo());
                rbGanadorLocal2.setEnabled(false);
                rbGanadorVisitante2.setEnabled(false);
            } else if (rbGanadorVisitante2.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoVisitante.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(1).getEquipo_local().getCod_equipo());
                rbGanadorLocal2.setEnabled(false);
                rbGanadorVisitante2.setEnabled(false);
            }
            if (rbGanadorLocal3.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoLocal3.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(2).getEquipo_local().getCod_equipo());
                rbGanadorLocal3.setEnabled(false);
                rbGanadorVisitante3.setEnabled(false);
            } else if (rbGanadorVisitante3.isSelected()) {
                codEquipo = JEMS.introducirResultado(tfEquipoVisitante3.getText());
                JEMS.resultadoEnPartido(codEquipo, listaJornadas.get(num).getCod_jornada(), listaJornadas.get(num).getPartidos().get(2).getEquipo_local().getCod_equipo());
                rbGanadorLocal3.setEnabled(false);
                rbGanadorVisitante3.setEnabled(false);
            }
            ControladorVistas.abrirVentanaAviso("Joranda Actualizada");
        } catch (SQLException ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_bActualizarActionPerformed
    /**
     * Volver a la ventana administrador.
     *
     * @param evt accionde clickar
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaResultado();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Salir del programa.
     *
     * @param evt accion de clickar
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void rbGanadorLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGanadorLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGanadorLocalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_IntroducirResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel lbBackgroundIntroducirResultado;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbCodigoDueño;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVS;
    private javax.swing.JLabel lbVS2;
    private javax.swing.JLabel lbVS3;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JRadioButton rbGanadorLocal;
    private javax.swing.JRadioButton rbGanadorLocal2;
    private javax.swing.JRadioButton rbGanadorLocal3;
    private javax.swing.JRadioButton rbGanadorVisitante;
    private javax.swing.JRadioButton rbGanadorVisitante2;
    private javax.swing.JRadioButton rbGanadorVisitante3;
    private javax.swing.JTextField tfEquipoLocal;
    private javax.swing.JTextField tfEquipoLocal2;
    private javax.swing.JTextField tfEquipoLocal3;
    private javax.swing.JTextField tfEquipoVisitante;
    private javax.swing.JTextField tfEquipoVisitante2;
    private javax.swing.JTextField tfEquipoVisitante3;
    private javax.swing.JTextField tfNumJornada;
    // End of variables declaration//GEN-END:variables
}
