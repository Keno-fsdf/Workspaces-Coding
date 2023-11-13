import sympy as sy
x1, x2 = sy.symbols("x1 x2")
#py_A
equations = [
sy.Eq( 10*x1 +-5*x2, -60 ),
sy.Eq( 4*x1 +- 5*x2 , -42 ),
# sy.Eq(-4*x1 + 5*x2 - 3*x3 , 21 ),
]
print (sy.solve(equations))
