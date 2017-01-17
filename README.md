#Monopoly
<b>How to Play</b><br>
You start off by inputting how many players you want, then have an option of a nickname for each player. Each player has a preset color that corresponds with it.Then, you roll to see which player goes first. <br>
Most of the rules are given as messages in the middle of the board throughout when you play. Your goal is to buy as much property and then build houses and hotels such that you bankrupt other players. Once you run out of money, you lose.<br>
<br><br>
Working features: <br>
Pressing on a tile gives you the information on that tile. <br>
Choosing players, and nicknames (You can skip the nickname part and you'll have default nickname.) <br>
Rolling, giving back a random number. You cannot skip your turn without rolling. After rolling you can buy property, mortgage, choose to trade with another player. <br>
Buying property. (It doesn't allow you to buy property another player owns, or tiles such as Chance or Jail.) <br>
Paying rent correctly to the right player, and paying double if they own a monopoly, more if they own a house. (Electric Company and Water Works works properly, the pay is according to the roll.) <br>
Buying houses, making sure that you can only buy if you own a monopoly and land on the property and have at least 1 on each before buying another house. <br>
Mortgaging property that you own when you land on it. <br>
Trading with another player using money or one of their properties. <br>
Jail works such that you get locked in for 3 turns unless you roll a double. <br>
Chance and Community Chest cards work for the most part. <br>
<br><br>
Bugs: <br>
For some reason, players cannot buy Boardwalk. <br>
Some Chance and Community Chest cards don't work properly (You don't pay the rent when you move back 3 spaces) <br>
Railroad rent doesn't work, players just pay $25, not more even if the owner owns more railroads. <br>
Not really a bug but, when needing to input into the textbox, it needs to be really exact (in regards to spaces and stuff, especially for trading) <br>
The GUI display doesn't look too nice, the top row doesn't show the number. <br>
You have to hover over the tile to clear the black dots which represent the players because it lags in removing it from the button. <br>
If the player is on a tile with the same color as its dot, you can't see it. <br>
The log on the side doesn't keep going when it reaches the max. <br>
Some features that we couldn't implement: <br>
Property going up to aunction when it is not bought. <br>
Mortgaging at anytime, and unmortgaing at any time. <br>
Unmortgaing. <br>
<br><br>
Directions on how to compile and run the code: <br>
cd into Cards/ <br>
javac Board.java <br>
java Board <br>
<br><br>
Directions on how to run the program: <br>
Follow the messages on the middle of the board. 