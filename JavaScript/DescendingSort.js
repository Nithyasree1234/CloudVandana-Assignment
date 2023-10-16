const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function descendingSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

function main() {
    rl.question("Enter the size: ", (size) => {
        const arr = new Array(parseInt(size, 10));
        console.log("Enter array elements:");
        let currentIndex = 0;

        const inputElement = () => {
            rl.question(`Enter element ${currentIndex + 1}: `, (element) => {
                arr[currentIndex] = parseInt(element, 10);
                currentIndex++;

                if (currentIndex < size) {
                    inputElement(); // Recursive call for the next element
                } else {
                    rl.close();
                    console.log("Array before sorting: " + arr.join(' '));
                    const sortedArray = descendingSort(arr);
                    console.log("Sorted Array in Descending Order: " + sortedArray.join(' '));
                }
            });
        };

        inputElement();
    });
}

main();
