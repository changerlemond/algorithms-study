use std::io::stdin;

pub fn beak_joon_1001() {
    // input
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();

    // split and collect
    let nums: Vec<i32> = input.trim().split_whitespace().map(|x| x.parse().expect("Err")).collect();

    // subtract
    println!("{}", nums[0] - nums[1]);
}