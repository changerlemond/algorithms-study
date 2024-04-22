use std::io::stdin;

pub fn beak_joon_1000() {
    // input
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();

    // split
    let mut input = input.split_ascii_whitespace().flat_map(str::parse::<usize>);
    let a = input.next().unwrap();
    let b = input.next().unwrap();

    // add
    let result = a + b;
    println!("{}", result);
}