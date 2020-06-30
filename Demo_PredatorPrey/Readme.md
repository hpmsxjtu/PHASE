# PHASE(Parallel High-performence Agent-based Simulation Environment)

Demo: Predator-Prey Model

2020.6 Version 2.0

1 Description

    1.1 Introduction 

    The Predator-Prey model is another classic use case in Agent-based simulation. It intuitively expresses the survival relationship between the predators and the preys, and here we simulate the quantitative relationship between populations.

​    
    1.2 Environment
    + Ubuntu 14.04.4
    + Java Development Kit (JDK) 8 or later (JDK 8 is recommended)
    + Ant 1.9.7
    + X10 2.6
    + Mpich 3.2
    + SSH 3.6


2 Demo: Predator-Prey
​    
    2.1 Configuration steps

        2.1.1 Step 1: Agent.x10
        Agent represents entities in the simulation model, such as Predator and Prey.
        
        2.1.2 Step 2: Grid.x10
        Grid represents the scale of the simulation environment, such as 1,600*1,600.
    
        2.1.3 Step 3: Model.x10
        Model is the logical order configuration of the simulation model, that is, the model is developed in the set order, and We can run the specified event at the specified tick time.
    
        2.1.4 Step 4: Event.x10
        In the environment, Event represents the specific event executed in the simulation. This file is the specific implementation of the Model in the third step. Each event has a strict order of execution.
    
        2.1.5 Step 5: DataCollection.x10
        Data collection can occur in any given event or at any time, but you need to customize the data collection event.
    
        2.1.6 Step 6: PredatorPreyRun.x10 & Setting.x10
        Count the time in the main function in the Run.x10 file and set the relevant parameters in the Setting.x10 file, such as the numbers of the Predator and the Prey.
        
    2.2 Compile and run commands 
    
        2.2.1 Step 1: Compile commands
        >>> x10c++ -o PredatorPreyRun PredatorPreyRun.x10 -x10rt mpi
        
        2.2.2 Step 2: Run commands
        >>> mpiexec -n 8 -f /home/hpms/mpi_config_file ./ PredatorPreyRun
        Note: The "-n" means the numbers of the Place.
    
    Then, we can simulate it.

3 Improvements​   

    3.1 The function to find the Agent's neighbors
    We use the concept of remote and local, by reducing the operation of at, the simulation time is reduced.
    
    3.2 More behavior rules
    Different entities have more behavior rules.


​    
​    
