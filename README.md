# Algoritmo-FIFO
La clase SimuladorFIFO es el componente principal encargado de gestionar la lógica de la simulación del algoritmo de planificación FIFO. Administra la creación aleatoria de procesos, su almacenamiento en la cola de espera y su ejecución en orden de llegada.

Controla la transición de los procesos entre los estados (nuevo, espera, ejecución y terminado), así como la validación del límite máximo de la cola, enviando los procesos excedentes a una lista de rechazados. Además, se encarga de actualizar la tabla de estados en tiempo real y de calcular las estadísticas finales del sistema, como procesos creados, atendidos, finalizados, rechazados y el tiempo promedio de ejecución.
