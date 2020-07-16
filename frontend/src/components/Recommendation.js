import React from "react";
import {Card} from "antd";
import {RecommendationList} from "./RecommendationList";

export class Recommendation extends React.Component{

    render() {
        return(
            <Card
                title={<span style={{float:"left"}}>您可能还喜欢</span>}
                bordered={true}
                style={{ width: 350, marginLeft: 30 }}
            >
                <RecommendationList/>
            </Card>

            );
    }
}
