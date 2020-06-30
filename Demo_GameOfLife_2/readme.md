# PHASE(Parallel High-performence Agent-based Simulation Environment)

Demo: GameOfLifeModel

2020.6 Version 2.0

## 1 Description

```
1.1 Introduction 

The Game of Life is not your typical computer game. It is a 'cellular automaton', and was invented by Cambridge mathematician John Conway.

This game became widely known when it was mentioned in an article published by Scientific American in 1970. It consists of a collection of cells which, based on a few mathematical rules, can live, die or multiply. Depending on the initial conditions, the cells form various patterns throughout the course of the game.

I called my srccode-file Optimisic-Conservative Combined Time Advance Mechanism (OCCTAM).

1.2 Environment
+ Ubuntu 14.04.4
+ Java Development Kit (JDK) 8 or later (JDK 8 is recommended)
+ Ant 1.9.7
+ X10 2.6
+ Mpich 3.2
+ SSH 3.6
```

## 2 Demo: Game of Life

### 2.1 Configuration steps

    2.1.1 Step 1: Agent.x10
    Agent represents entities in the simulation model, such as Predator and Prey.
    
    2.1.2 Step 2: Grid.x10
    Grid represents the scale of the simulation environment, such as 1,600*1,600.
    
    2.1.3 Step 3: GameOfLifeModel.x10
    Model is the logical order configuration of the simulation model, that is, the model is developed in the set order, and We can run the specified event at the specified tick time.
    
    2.1.4 Step 4: GameOfLifeEventSequence.x10
    In the environment, Event represents the specific event executed in the simulation. This file is the specific implementation of the Model in the third step. Each event has a strict order of execution.
    Matters needing attention: the initialization function init() needs to add setOverlap(Overlap.nOfoverlap); code snippet to specify the number of overlapping areas
    
    2.1.5 Step 6: Launcher.x10 & Setting.x10
    Count the time in the main function in the Launcher.x10 file and set the relevant parameters in the Setting.x10 file, such as the numbers of the cell.

### 2.2 Compile and run commands 

    2.2.1 Step 1: Compile commands
    >>> x10c++ -o Launcher Launcher.x10 -x10rt mpi
    
    2.2.2 Step 2: Run commands
    >>> mpiexec -n 8 -f /home/hpms/mpi_config_file ./ PredatorPreyRun
    Note: The "-n" means the numbers of the Place.

Then, we can simulate it.

## 3 Improvements

In this demo, the operation of the overlapping area is introduced, and the adaptive algorithm is designed and implemented, which greatly improves the efficiency of the simulation program.