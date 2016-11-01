

function hasAllUniqueChars(str) {
    for (var i = 0; i < str.length; i++) {
        for (var j = i+1; j < str.length; j++) {
            if (str[i] == str[j])
                return true;
        }
    }
    return false;
}

function test() {
    var words = ["abcd", "hello", "world", "aaqq", "bbad", "c", ""];
    words.forEach(function(elt,index,array) {
        console.log("word " + elt + " has all uniques ? " + hasAllUniqueChars(elt));
    })
}

test()