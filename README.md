# DebugDataBanditsWebsite

## Description

This is a Spring Boot Application Website created by the DebugDataBandits. The website's theme is "Gaming", which is why there's a "Gaming Controller Logo" seen on the top left of the website. Some of the programs that can be accessed via this site are related to Gaming as well. The background image on the website includes a Rainbow Six Siege Bandit, which the "DebugDataBandits" team name originates from. Furthermore, the colors used throughout the website, such as black, white, & teal give the website a Gaming vibe.

## Features of the Site

- Home Page Navigation Button
- Greeting Program
- Calculator Program
- Snake Game Program
- Tic Tac Toe Game Program
- Pair Journals
- Access to the DebugDataBandits' Previous Project Repository

## Link to Website

- The website was deployed using Heroku.
- Click [here](https://debug-data-bandits-website.herokuapp.com/) to access the website.

## How to Run

###### 1. Website

- To access the website, click on the link provided above.
- NOTE: Our team had difficulty figuring out how to make the CSS formatting work when deployed, so the link to the website above leads to a non-CSS formatted website.
- However, to access the CSS formatting, pull this repository from the Main branch, navigate to the Index.htmml file, & click on one of the browser icons that appears when the mouse hovers over the HTML file.
- Or, watch this demonstration video to look at the CSS formatting.

###### 2. Greeting

- To access the Greeting program, first click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click on "Greeting".

###### 3. Calculator

- To access the Calculator program, first click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click on "Calculator".

###### 4. Snake

- NOTE: Due to some embedding issues, our team had difficulty implementing the Snake Game into the website, so instead, we linked a Snake Game Demonstration Video.
- To access the Snake Game Demonstration Video, click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click "Snake".
- In order to run the Snake Game program, click [here](https://github.com/AdityaS1426/SnakeGame) to access the separate repository we made for the Snake Game program. We made a separate repository so that the main repository would not be cluttered.
- Now, pull the Main branch.
- Run "Main".
- An application window should pop up, & the game should automatically start.

###### 5. Tic Tac Toe

- Due to some embedding issues, our team had difficulty implementing the Tic Tac Toe Game into the website, so instead, we linked a Tic Tac Toe Demonstration Video.
- To access the Tic Tac Toe Game Demonstration Video, click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click "Tic Tac Toe".
- In order to run the Tic Tac Toe Game program, click [here](https://github.com/AdityaS1426/TicTacToe) to access the separate repository we made for the Tic Tac Toe Game program. We made a separate repository so that the main repository would not be cluttered.
- Now, pull the Main branch.
- Run "TicTacToe".
- An application window should pop up, & the game should automatically start.

###### 6. Journals

- To access our Study Journals from the website, first click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click on the "Journals" button at the bottom.
- Now, click on the buttons with our team members' names at the bottom to access the respective Study Journals.

###### 7. Previous Project Repo

- To access our Previous Project Repo from the website, first click [here](https://debug-data-bandits-website.herokuapp.com/) to access our website.
- Next, click on the "Previous Project Repo" button at the bottom.
- This will take the user to our repository for the City Simulation Project we worked on during the first half of Trimester 2.

## How to Use

###### 1. Website

- Simply click on the tabs at the top to access the different features of the website, including the various programs.
- Clicking on the "Journals" button at the bottom will take the user to the Study Journals page of the website.
- Clicking on the "Previous Project Repo" button at the bottom will take the user to the repository for the City Simulation Project.

###### 2. Greeting

- The user must input an answer in the "Last Name" field.
- The user must input an answer in the "First Name" field.
- The user must input an answer in the "Middle Name" field.
- Click the "Submit" button to receive the greeting!

###### 3. Calculator

- For the simple calculator, enter a number in the field on the left, then enter a number in the field on the right.
- Click either the "+", "-", "*", or "/" button to perform the respective operation.
- For the advanced calculator, enter a number in the field.
- Click either the "fib", "!", Sqrt, or "^" button to perform the respective operation.
- In either calculator, click the "C" button to clear the calculation.

###### 4. Snake

- Once the application window has opened, the snake will already be moving.
- To control the movement of the snake, press the "up" arrow key to go up, the "down" arrow key to move down, the "left" arrow key to move left, and the "right" arrow key to move right.
- To objective is to eat as much "food" as possible; the "food" is the blue square on the grid.
- To exit the game, simply press the "X" on the top right of the application window.
- To restart the program, run the program once again.

###### 5. Tic Tac Toe

- Once the application window has opened, a grid will appear.
- Player 1 goes first, & is assigned the symbol "X", while Player 2 goes second, & is assigned the symbol "O".
- Take turns using the mouse to click on a square in the gird in which to place the symbol.
- Whoever gets three of their respective symbol in a column, in a row, or in a diagonal wins the game.
- If neither player gets three of their respective symbol in a column, in a row, or in a diagonal, a tie occurs.

## Technicals

###### 1. Website

NOTE: The most important technicals for each aspect of the project will be outlined here, but further technicals WITH LINKS TO CODE can be found in the Issues section of the repositories.

###### 1. Website

  CLICK [HERE](https://github.com/AdityaS1426/DebugDataBanditsWebsite/issues) TO ACCESS THE ISSUES SECTION.

- Spring Annotations, such as GetMapping & RequestMapping, are used to map various branches of the website.
- HTML is used to create basic website layout.
  - Content of the website
  - Insert Links to Access Other Features of the website
- CSS is used to format the website.
  - Background Image
  - Button Hovering Feature (When the mouse is hovering above a button, the butoon changes color.)
  - Logo for Team
  - Colors on Website
  - Navigation Bar

###### 2. Greeting

CLICK [HERE](https://github.com/AdityaS1426/DebugDataBanditsWebsite/issues) TO ACCESS THE ISSUES SECTION.

- HTML "Form" is utilized to take in user input.
- HTML "Label" is used for the "Submit" button.
- Simple "Print" statement is used to display Greeting.
- Like the rest of the website, Spring Annotations are used in the GreetingController class to map the program to a branch of the website.
