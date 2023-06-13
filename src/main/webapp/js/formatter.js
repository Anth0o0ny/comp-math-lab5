const polynomial = document.getElementById("polynomial")
const sinus = document.getElementById("sinus");

katex.render(
    "y = x^4 - 3x^3 - 7x^2 + 2",
    polynomial
);

katex.render(
    "y = \\sin(x)",
    sinus
);