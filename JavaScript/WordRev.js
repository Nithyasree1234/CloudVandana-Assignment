const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWord(str) {
    let words = str.split(" ");
    let reverse = "";

    for (let i = 0; i < words.length; i++) {
        let revWord = "";
        for (let j = words[i].length - 1; j >= 0; j--) {
            revWord += words[i][j];
        }
        reverse += revWord + " ";
    }
    return reverse.trim();
}

rl.question("Enter string: ", (str) => {
    const reversedString = reverseWord(str);
    console.log("Reversed string: " + reversedString);
    rl.close();
});
