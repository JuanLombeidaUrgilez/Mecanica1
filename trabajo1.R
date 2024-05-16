setwd("C:/Users/miche/OneDrive/Escritorio/TRABAJO")
datos <- read.csv("TRABAJO1.csv",header=TRUE, sep= ";",dec=",")
summary(datos)
View (datos)
attach(datos)
#Calcule el mínimo, máximo, rango y defina la amplitud
min(DistanciaX)
max(DistanciaX)
range(DistanciaX)
diff(range(DistanciaX))

datos$DistanciaXCut<-cut(datos$DistanciaX, c(15,20,25,30,35,40,45))

#Calcule la media, mediana y moda
mean(DistanciaX) 
median(DistanciaX)


densidad <- density(DistanciaX)
moda <- densidad$x[which.max(densidad$y)]
cat("La moda es: ",moda,"\n")
library(tidyr)
library(tidyverse)
library(ggplot2)
#Histrogramas
# Histograma con densidad suavizada para la distancia en X
ggplot(datos, aes(x = DistanciaX)) +
  geom_histogram(fill = "lightblue", color = "black", bins = 20) +
  geom_density(fill = "red", alpha = 0.3, adjust = 1) +  # Línea de densidad suavizada
  labs(title = "Histograma de la Distancia en X",
       x = "Distancia en X", y = "Frecuencia") +
  theme_minimal()


# Histograma para la distancia en Y
ggplot(datos, aes(x = DistanciaY)) +
  geom_histogram(fill = "lightgreen", color = "black", bins = 20) +
  labs(title = "Histograma de la Distancia en Y",
       x = "Distancia en Y", y = "Frecuencia") +
  theme_minimal()
# Crear datos_long usando gather
datos_long <- gather(datos, key = "Distancia", value = "Valor", DistanciaX, DistanciaY)

# Verificar los primeros registros de datos_long para asegurarnos de que los datos se transformaron correctamente
head(datos_long)

#Diagramas de caja 
# Diagrama de caja para la distancia en X
ggplot(datos, aes(x = factor(Velocidad), y = DistanciaX, fill = Velocidad)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en X por Velocidad",
       x = "Velocidad", y = "Distancia en X") +
  theme_minimal()

# Diagrama de caja para la distancia en Y
ggplot(datos, aes(x = factor(Velocidad), y = DistanciaY, fill = Velocidad)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en Y por Velocidad",
       x = "Velocidad", y = "Distancia en Y") +
  theme_minimal()

# Diagrama de caja para ambas distancias
datos_long <- tidyr::gather(datos, key = "Distancia", value = "Valor", DistanciaX, DistanciaY)
ggplot(datos_long, aes(x = factor(Velocidad), y = Valor, fill = Velocidad)) +
  geom_boxplot() +
  labs(title = "Diagrama de Caja de Distancia en X e Y por Velocidad",
       x = "Velocidad", y = "Distancia", fill = "Velocidad") +
  facet_wrap(~Distancia, scales = "free_y") +
  theme_minimal()

#Gráficos de dispersión con el ángulo en la distancia x
ggplot(datos, aes(x = Grados, y = DistanciaX, color = Velocidad)) +
  geom_point() +
  labs(title = "Gráfico de Dispersión de Distancia en X vs Ángulo",
       x = "Ángulo", y = "Distancia en X", color = "Velocidad")
#Gráficos de dispersión con el ángulo en la distancia en y
ggplot(datos, aes(x = Grados, y = DistanciaY, color = Velocidad)) +
  geom_point() +
  labs(title = "Gráfico de Dispersión de Distancia en Y vs Ángulo",
       x = "Ángulo", y = "Distancia en Y", color = "Velocidad")
#Gráficos de dispersión con el ángulo en la Distancia X y Y
ggplot(datos, aes(x = Grados, color = Velocidad)) +
  geom_point(aes(y = DistanciaX), shape = 1, size = 2) +  # Distancia en X
  geom_point(aes(y = DistanciaY), shape = 2, size = 2) +  # Distancia en Y
  labs(title = "Gráfico de Dispersión de Distancia en X e Y vs Ángulo",
       x = "Ángulo", y = "Distancia", color = "Velocidad")




