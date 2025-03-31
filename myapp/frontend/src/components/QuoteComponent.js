import React, {useState, useEffect} from 'react';
import axios from 'axios';

function QuoteComponent(){
    const [quote, setQuote] = useState("");
    useEffect(() => {
    fetchQuote();
    }, []);
    const fetchQuote = async()=>{
        try{
            const response = await axios.get("http://localhost:8080/api/quote");
            setQuote(response.data.quote);
        }catch(error){
            console.error("Error fetching quote:", error);
        }
    }
}

export default QuoteComponent;