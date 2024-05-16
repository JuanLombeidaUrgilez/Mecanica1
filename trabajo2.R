setwd("C:/Users/miche/OneDrive/Escritorio/TRABAJO")
datos <- read.csv("TRABAJO 2.csv",header=TRUE, sep= ";",dec=",")
View (datos)
attach(datos)
#Calcule el mínimo, máximo, rango y defina la amplitud
min(DistanciaX)
max(DistanciaX)
range(DistanciaX)
diff(range(DistanciaX))


#Calcule la media, mediana y moda
mean(DistanciaX) 
median(DistanciaX)


densidad <- density(DistanciaX)
moda <- densidad$x[which.max(densidad$y)]
cat("La moda es: ",moda,"\n")
library(ggplot2)
# Histograma para la distancia en X
ggplot(datos, aes(x = DistanciaX)) +
  geom_histogram(fill = "lightblue", color = "black", bins = 20) +
  labs(title = "Histograma de la Distancia en X",
       x = "Distancia en X", y = "Frecuencia") +
  theme_minimal()

# Histograma para la distancia en Y
ggplot(datos, aes(x = DistanciaY)) +
  geom_histogram(fill = "lightgreen", color = "black", bins = 20) +
  labs(title = "Histograma de la Distancia en Y",
       x = "Distancia en Y", y = "Frecuencia") +
  theme_minimal()

# Diagrama de caja para la distancia en X
ggplot(datos, aes(x = factor(Velocidades), y = DistanciaX, fill = Velocidades)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en X por Velocidad",
       x = "Velocidad", y = "Distancia en X") +
  theme_minimal()

# Diagrama de caja para la distancia en Y
ggplot(datos, aes(x = factor(Velocidades), y = DistanciaY, fill = Velocidades)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en Y por Velocidad",
       x = "Velocidad", y = "Distancia en Y") +
  theme_minimal()

# Diagrama de caja para ambas distancias
datos_long <- tidyr::gather(datos, key = "Distancia", value = "Valor", DistanciaX, DistanciaY)
ggplot(datos_long, aes(x = factor(Velocidades), y = Valor, fill = Velocidades)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en X e Y por Velocidad",
       x = "Velocidad", y = "Distancia", fill = "Velocidad") +
  facet_wrap(~Distancia, scales = "free_y") +
  theme_minimal()


# Gráfico de dispersión con el ángulo en la distancia X y la velocidad 
ggplot(datos, aes(x = Angulos, y = DistanciaX, color = Velocidades)) +
  geom_point() +  # Usar geom_point en lugar de geom_jitter
  labs(title = "Gráfico de Dispersión de Distancia en X vs Ángulo",
       x = "Ángulo", y = "Distancia en X", color = "Velocidad")
# Gráfico de dispersión con el ángulo en la distancia Y y la velocidad
ggplot(datos, aes(x = Angulos, y = DistanciaY, color = Velocidades)) +
  geom_point() +
  labs(title = "Gráfico de Dispersión de Distancia en Y vs Ángulo",
       x = "Ángulo", y = "Distancia en Y", color = "Velocidad")

# Gráfico de dispersión con el ángulo en la distancia X e Y y la velocidad
ggplot(datos, aes(x = Angulos, y = DistanciaY, color = Velocidades)) +
  geom_point() +
  geom_point(aes(y = DistanciaX), color = "blue") +  # Agregar puntos para la distancia X
  labs(title = "Gráfico de Dispersión de Distancia en X e Y vs Ángulo",
       x = "Ángulo", y = "Distancia", color = "Velocidad")





