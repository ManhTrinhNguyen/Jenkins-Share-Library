# Creat Jenkins Shared Library 
1. Write the Shared Library available global or for project
2. Use library in Jenkinfile to extend the Pipeline 
# Struture of Jenkins Shared Library 
1. **Vars** folder
  1. Functions that we call from Jenkins file
  2. Each function /execution step is its own Groovy file
2. **Srcs** folder
  1. Helper code
3. **Resources** folder
  1. User external libraries
  2. Non Groovy files     
