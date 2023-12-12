import numpy as np

# Die gegebene Adjazenzmatrix
adjacency_matrix = np.array([
    # [0, 1 ,1],
    # [1, 1, 0],
    # [1, 0, 1]



    [0, 1, 1, 0, 1],
    [1, 0, 0, 1, 1],
    [1, 0, 0, 1, 1],
    [0, 1, 1, 0, 0],
    [1, 1, 1, 0, 0]
])

# Start- und Zielzustände
start_state = 1
end_state = 3
schritte = 2   #matrix potenzieren 


# Berechnung der Anzahl der Pfade in 4 Schritten

#1. wir nehmen die Matrix hoch 4

paths_in_4_steps = np.linalg.matrix_power(adjacency_matrix, schritte)[start_state - 1, end_state - 1]

print (np.linalg.matrix_power(adjacency_matrix, schritte))   #Matrix hoch 4 genommen



#index 4 und index 4 = 19

print(f"Anzahl der Pfade in 4 Schritten von Zustand {start_state} zu Zustand {end_state}: {paths_in_4_steps}")



#1.  Potenzieren die Matrix mit der Anzahl der Schritte
#2. nehme den wert beim Start-Index und End-Index -->Das ist das Ergebnis
    