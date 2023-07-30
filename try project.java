import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] border = {{" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "}};

            borderxo(border);

            while (true) {
                Scanner u = new Scanner(System.in);
                int user = 0;
                try {
                    System.out.println("\nWhere woudld you like to play?(1-9)");
                    user = u.nextInt(10);
                } catch (InputMismatchException e1) {
                    System.out.println("Plase enter number!! ");
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                } finally {
                    System.out.println("WOW");
                }

                if (isckSpace(border, user) == true) {
                    System.out.println("\n Choose the player  " + user);
                    users(user, border);
                    borderxo(border);


                    Random random = new Random();
                    int computer = 0;
                    try {
                        computer = random.nextInt(9) + 1;
                    } catch (InputMismatchException e5) {
                        System.out.println(e5.getMessage());
                    } catch (Exception e6) {
                        System.out.println(e6.getMessage());
                    } finally {
                        System.out.println("\nw");
                    }

                    if (isckSpa(border, computer) == true) {
                        computer(user, computer, border);
                        System.out.println("\n computer chose  " + computer);
                        borderxo(border);

                    }
                    isGameOver(user, computer, border);
                } else {
                    System.out.println("\n\n" + user + "  is not valid move");
                }

            }
        }


        private static boolean isckSpace (String[][]border,int user){
            switch (user) {
                case 1:
                    return (border[0][0] == " ");
                case 2:
                    return (border[0][2] == " ");
                case 3:
                    return (border[0][4] == " ");
                case 4:
                    return (border[2][0] == " ");
                case 5:
                    return (border[2][2] == " ");
                case 6:
                    return (border[2][4] == " ");
                case 7:
                    return (border[4][0] == " ");
                case 8:
                    return (border[4][2] == " ");
                case 9:
                    return (border[4][4] == " ");
                default:
                    return false;


            }

        }

        private static boolean isckSpa (String[][]border,int computer){
            switch (computer) {
                case 1:
                    return (border[0][0] == " ");
                case 2:
                    return (border[0][2] == " ");
                case 3:
                    return (border[0][4] == " ");
                case 4:
                    return (border[2][0] == " ");
                case 5:
                    return (border[2][2] == " ");
                case 6:
                    return (border[2][4] == " ");
                case 7:
                    return (border[4][0] == " ");
                case 8:
                    return (border[4][2] == " ");
                case 9:
                    return (border[4][4] == " ");
                default:
                    return false;


            }


        }

        public static void borderxo (String[][]border){
            for (int i = 0; i < border.length; i++) {
                System.out.println();
                for (int j = 0; j < border[i].length; j++) {
                    System.out.print(border[i][j]);


                }
            }
        }

        public static void users ( int user, String border[][]){


            switch (user) {
                case 1:
                    border[0][0] = "X";
                    break;
                case 2:
                    border[0][2] = "X";
                    break;
                case 3:
                    border[0][4] = "X";
                    break;
                case 4:
                    border[2][0] = "X";
                    break;
                case 5:
                    border[2][2] = "X";
                    break;
                case 6:
                    border[2][4] = "X";
                    break;
                case 7:
                    border[4][0] = "X";
                    break;
                case 8:
                    border[4][2] = "X";
                    break;
                case 9:
                    border[4][4] = "X";
                    break;
                default:
                    System.out.println("\nis not a valid move");
            }

        }


        public static void computer ( int user, int computer, String border[][]){


            switch (computer) {
                case 1:
                    border[0][0] = "O";
                    break;
                case 2:
                    border[0][2] = "O";
                    break;
                case 3:
                    border[0][4] = "O";
                    break;
                case 4:
                    border[2][0] = "O";
                    break;
                case 5:
                    border[2][2] = "O";
                    break;
                case 6:
                    border[2][4] = "O";
                    break;
                case 7:
                    border[4][0] = "O";
                    break;
                case 8:
                    border[4][2] = "O";
                    break;
                case 9:
                    border[4][4] = "O";
                    break;
                default:

            }
        }

        public static boolean isGameOver ( int user, int computer, String[][] border){


            if (border[0][0] == "X" && border[0][2] == "X" && border[0][4] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;


                return true;
            }


            if (border[0][0] == "O" && border[0][2] == "O" && border[0][4] == "O") {
                System.out.println("\nComputer Wins ): ");
                user++;
                return true;
            }
            if (border[0][0] == "X" && border[2][0] == "X" && border[4][0] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[0][0] == "O" && border[2][0] == "O" && border[4][0] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }
            if (border[0][0] == "X" && border[2][2] == "X" && border[4][4] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[0][0] == "O" && border[2][2] == "O" && border[4][4] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }


            if (border[2][0] == "X" && border[2][2] == "X" && border[2][4] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[2][0] == "O" && border[2][2] == "O" && border[2][4] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }

            if (border[4][0] == "X" && border[4][2] == " 'X'" && border[4][4] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[4][0] == "O" && border[4][2] == "O" && border[4][4] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }

            if (border[0][2] == "X" && border[2][2] == "X" && border[4][2] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[0][2] == "O" && border[2][2] == "O" && border[4][2] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }

            //Diagonal Wins
            if (border[0][4] == "X" && border[2][4] == "'X' " && border[4][4] == "X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[0][4] == "O" && border[2][4] == "O" && border[4][4] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;
            }

            if (border[0][4] == "X" && border[2][2] == "X" && border[4][0] == " X") {
                System.out.println("\nPlay Wins :) ");
                user++;
                return true;
            }
            if (border[0][4] == "O" && border[2][2] == "O" && border[4][0] == "O") {
                System.out.println("\nComputer Wins): ");
                computer++;
                return true;

            }
            if (border[0][0] != " " && border[0][2] != " " && border[0][4] != " " && border[2][0] != " " &&
                    border[2][2] != "" && border[2][4] != " " && border[4][0] != " " && border[4][2] != " " && border[4][4] != " ") {
                System.out.println("\n\nIts a tie");
                return true;
            }

            return false;
        }
    }






