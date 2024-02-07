
# Codekata

This is the template of Codekata, here you will find the instructions of the Codekatabattle application.





## Educators

You are required to create a problem statement and accompanying test cases adhering to the provided template. Pay close attention to the accuracy of the test cases, as they will determine the scoring for the teams. Ensure that your problem statement is clear, concise, and effectively communicates the requirements of the task. The quality and thoroughness of your test cases are crucial in evaluating the solution's correctness.


#### Instructions
- Log in to the CodeKata platform.
- Create a tournament.
- Initiate a battle within the tournament.
- Upload your CodeKata problem in a .zip file.
- Let's enjoy the challenge!
- At the conclusion of the battle, you have the option to assign additional points to each solution submitted by students.

#### How to create a Codekata?
- Let's start from template given in the platform
- All Tests must be written in the `src/test/java/` directory
    - The number of tests is defined as the count of methods with the `@Test` annotation, not as the number of `Assertions` present. (For instance, a method annotated with `@Test` containing 10 `Assertions` will be considered as one test.)
- You have the freedom to decide how and where to write CodeKata problems (from the path to the file name), just ensuring that they match *Maven* requirements to execute the `mvn test` command.

#### Constraints
- Don't modify `pom.xml` file, we don't guarantee the correctness of system execution.
## Students

You are tasked with solving *CodeKata* problems provided. Your goal is to complete unfinished methods to **pass as many tests as possible**. Each time you push to the master branch, the *CodeKataBattle System* will be notified, and you will be assigned a **score based on** your performance
- **Number of test pass out**
- **Time passed from the start of the battle**

#### Instructions
- Go to tournaments page
- Find out a tournament in Registration state
- Wait until any educator create a battle and register to it
- When battle starts you will be notified and given a GitHub repository link to **fork**
- Setup `.github/workflows/main-yaml` file with
    - Repository link in *<SET_UP_GITHUB_REPO_LINK>*
    - Team Token given in the battle page in *<SET_UP_TEAM_TOKEN_FROM_BATTLE_PAGE>*


#### Contraints
- Don't modify `pom.xml` file, we don't guarantee the correctness of system execution.

## Feedback

If you have any feedback, please reach out to us at codekata-battle@gmail.com