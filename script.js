const screen = document.getElementById("screen");
const buttons = document.querySelectorAll(".buttons button");

let currentInput = "";

// Calculator logic
buttons.forEach(button => {
  button.addEventListener("click", () => {
    const value = button.textContent;

    if (value === "AC") {
      currentInput = "";
      screen.value = "";
    } 
    else if (value === "DE") {
      currentInput = currentInput.slice(0, -1);
      screen.value = currentInput || "0";
    } 
    else if (value === "=") {
      try {
        currentInput = eval(currentInput).toString();
        screen.value = currentInput;
      } catch {
        screen.value = "Error";
        currentInput = "";
      }
    } 
    else {
      currentInput += value;
      screen.value = currentInput;
    }
  });
});

// Dark / Light mode
const toggleBtn = document.getElementById("toggleMode");
toggleBtn.addEventListener("click", () => {
  document.body.classList.toggle("dark");
});

// Mini game logic
const questionEl = document.getElementById("question");
const timeEl = document.getElementById("time");
const scoreEl = document.getElementById("score");
const startBtn = document.getElementById("startGame");

let time = 30;
let score = 0;
let correctAnswer = 0;
let timer;

function randomQuestion() {
  const a = Math.floor(Math.random() * 10) + 1;
  const b = Math.floor(Math.random() * 10) + 1;
  const ops = ["+", "-", "*"];
  const op = ops[Math.floor(Math.random() * ops.length)];

  const question = `${a} ${op} ${b}`;
  correctAnswer = eval(question);

  questionEl.textContent = question + " = ?";
}

startBtn.addEventListener("click", () => {
  score = 0;
  time = 30;
  scoreEl.textContent = score;
  timeEl.textContent = time;
  randomQuestion();

  clearInterval(timer);
  timer = setInterval(() => {
    time--;
    timeEl.textContent = time;

    if (time <= 0) {
      clearInterval(timer);
      questionEl.textContent = `⏰ Hết giờ! Điểm của bạn: ${score}`;
    }
  }, 1000);
});

// Check answer when press "="
buttons.forEach(button => {
  button.addEventListener("click", () => {
    if (button.textContent === "=" && time > 0) {
      const userAnswer = Number(screen.value);

      if (userAnswer === correctAnswer) {
        score++;
        scoreEl.textContent = score;
        randomQuestion();
        currentInput = "";
        screen.value = "";
      } else {
        questionEl.textContent = "❌ Sai rồi! Thử lại:";
      }
    }
  });
});
