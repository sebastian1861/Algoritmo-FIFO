# Algoritmo-FIFO
Este proyecto es un simulador del algoritmo de planificación FIFO (First In, First Out) para la gestión de procesos en un sistema operativo. El programa genera procesos de forma aleatoria con tiempos de ejecución entre 10 y 35 segundos (en múltiplos de 5) y los gestiona a través de los estados: nuevo, espera, ejecución y terminado.

El sistema mantiene una cola con un máximo de 10 procesos; cuando se alcanza este límite, los nuevos procesos son rechazados y almacenados en una lista de rechazados. Además, muestra en tiempo real una tabla con el estado de cada proceso, permitiendo visualizar su ciclo de vida completo.

El programa incluye controles de inicio y finalización, y al terminar presenta estadísticas como número de procesos creados, atendidos, finalizados, rechazados y el tiempo promedio de ejecución.
