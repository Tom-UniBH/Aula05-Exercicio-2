// Nome: Tom Alexander
// Matrícula: 1261933671

void main() {
  try (Scanner input = new Scanner(System.in)) {
    System.out.print("Lado A: ");
    double sideA = input.nextDouble();

    System.out.print("Lado B: ");
    double sideB = input.nextDouble();

    System.out.print("Lado C: ");
    double sideC = input.nextDouble();

    String triangleType = triangleType(sideA, sideB, sideC);
    System.out.println("O triângulo é " + triangleType);
  }
}

private static String triangleType(double sideA, double sideB, double sideC) {
  int equalSides = (sideA == sideB ? 1 : 0) +
                   (sideA == sideC ? 1 : 0) +
                   (sideB == sideC ? 1 : 0);

  return switch (equalSides) {
    case 1  -> "Isóceles";
    case 3  -> "Equilátero";

    default -> "Escaleno";
  };
}
