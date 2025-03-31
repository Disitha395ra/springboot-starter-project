import React, { useState, useEffect } from "react";
import axios from "axios";

function QuoteComponent() {
  const [quote, setQuote] = useState("");
  useEffect(() => {
    fetchQuote();
  }, []);
  const fetchQuote = async () => {
    try {
      const response = await axios.get("http://localhost:8080/api/quote");
      setQuote(response.data.quote);
    } catch (error) {
      console.error("Error fetching quote:", error);
    }
  };

  return (
    <div className="quote-container">
      <h2>Quote of the Day</h2>
      <p>📜{quote}</p>
      <button onClick={fetchQuote}>Get New Quote</button>
    </div>
  );
}

export default QuoteComponent;
