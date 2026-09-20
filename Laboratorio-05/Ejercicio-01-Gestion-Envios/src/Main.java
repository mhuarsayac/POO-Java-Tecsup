import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_ENVIOS = 50;
        int cantidadEnvios = 0;
        int indiceActual = 0;

        do {
            System.out.print("Ingrese la cantidad de envios que registrara: ");
            cantidadEnvios = Integer.parseInt(scanner.nextLine());
        } while (cantidadEnvios < 1 || cantidadEnvios > MAX_ENVIOS);
        Envio[] arrayEnvios = new Envio[cantidadEnvios];

        int opcion = 0;
        do {

            System.out.println("\n1- Agregar un envio" +
                    "\n2- Mostrar informacion de los envios" +
                    "\n3- Determinar el envio con mayor costo " +
                    "\n4- Calcular el monto total de todos los envios" +
                    "\n5- Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            boolean seRepiteCodigo = false;
            switch (opcion) {
                case 1:
                    if (indiceActual < cantidadEnvios) {
                        System.out.print("\nIngrese el codigo: ");
                        String codigo = scanner.nextLine();
                        if (indiceActual > 0) {
                            for (int i = 0; i < indiceActual; i++) {
                                if (arrayEnvios[i].getCodigo().equals(codigo)) {
                                    System.out.println("\nEl codigo: " + codigo + " ya existe.");
                                    seRepiteCodigo = true;
                                }
                            }
                        }

                        if (seRepiteCodigo) {
                            break;
                        } else {
                            System.out.print("Ingrese el peso: ");
                            float peso = Float.parseFloat(scanner.nextLine());
                            if (!Main.validarNumero(peso)) {
                                System.out.println("\nIngrese un numero mayor a 0");
                                break;
                            }
                            System.out.print("Ingrese su distancia: ");
                            float distancia = Float.parseFloat(scanner.nextLine());
                            if (!Main.validarNumero(distancia)) {
                                System.out.println("\nIngrese un numero mayor a 0");
                                break;
                            }
                            int tipoEnvio;
                            do {
                                System.out.println("\n1- Aereo \n2- Terrestre");
                                tipoEnvio = Integer.parseInt(scanner.nextLine());
                            } while (tipoEnvio < 1 || tipoEnvio > 2);
                            if (tipoEnvio == 1) {
                                System.out.print("\nIngrese el costo del seguro: ");
                                float costoSeguro = Float.parseFloat(scanner.nextLine());
                                if (!Main.validarNumero(costoSeguro)) {
                                    System.out.println("\nIngrese un numero mayor a 0");
                                    break;
                                }
                                arrayEnvios[indiceActual] = new EnvioAereo(codigo, peso, distancia, costoSeguro);
                            } else {
                                boolean esPrioritario;
                                String prioritario;
                                do {
                                    System.out.println("\nEs prioritario? [si/no]");
                                    prioritario = scanner.nextLine();
                                } while (!prioritario.equals("si") && !prioritario.equals("no"));
                                if (prioritario.equals("si")) {
                                    esPrioritario = true;
                                } else {
                                    esPrioritario = false;
                                }

                                arrayEnvios[indiceActual] = new EnvioTerrestre(codigo, peso, distancia, esPrioritario);
                            }
                            System.out.println("\nEnvio creado exitosamente");
                            indiceActual++;
                        }
                    } else {
                        System.out.println("\nLa lista de envios esta llena!!!");
                    }


                    break;
                case 2:
                    if (indiceActual < 1) {
                        System.out.println("\nNo hay envios registrados para mostrar");
                    } else {
                        for (int i = 0; i < indiceActual; i++) {
                            arrayEnvios[i].mostrarSeguimiento();
                        }
                    }
                    break;
                case 3:
                    if (indiceActual < 1) {
                        System.out.println("\nNo hay envios registrados para mostrar");
                    } else {
                        float mayor = -1;
                        int indiceMayor = -1;
                        for (int i = 0; i < indiceActual; i++) {
                            if (arrayEnvios[i].calcularCosto() > mayor) {
                                mayor = arrayEnvios[i].calcularCosto();
                                indiceMayor = i;
                            }
                        }
                        System.out.println("\nEl envio con mayor costo es:");
                        arrayEnvios[indiceMayor].mostrarSeguimiento();
                    }
                    break;
                case 4:
                    if (indiceActual < 1) {
                        System.out.println("\nNo hay envios registrados para mostrar");
                    } else {
                        float montoTotal = 0;
                        for (int i = 0; i < indiceActual; i++) {
                            montoTotal += arrayEnvios[i].calcularCosto();
                        }
                        System.out.println("\nEl monto total de todos los envios es: " + montoTotal);
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del programa");
                    break;
                default:
                    System.out.println("\nNo existe tal opcion!!!");
            }
        } while (opcion != 5);
    }

    public static boolean validarNumero(float numero) {
        return numero > 0;
    }
}