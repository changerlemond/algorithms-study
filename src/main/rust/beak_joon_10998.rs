use std::io::stdin;

pub fn beak_joon_10998() {
    // input
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();

    // split
    let nums: Vec<i32> = input.trim().split_whitespace().map(|x| x.parse().expect("Err")).collect();

    // multiple
    println!("{}", nums[0] * nums[1])
}