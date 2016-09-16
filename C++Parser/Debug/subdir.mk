################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../parse1_1.cpp \
../parse1_2.cpp \
../parse1_3.cpp \
../test.cpp 

OBJS += \
./parse1_1.o \
./parse1_2.o \
./parse1_3.o \
./test.o 

CPP_DEPS += \
./parse1_1.d \
./parse1_2.d \
./parse1_3.d \
./test.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<" -std=c++11
	@echo 'Finished building: $<'
	@echo ' '


